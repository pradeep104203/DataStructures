import java.util.Arrays;

public class Trie {

    private TrieNode root;

    Trie()
    {
        root=new TrieNode();
    }

    public int getIndex(char x)
    {
      return x-'a';
    }

    public void insert(String key)
    {
        if(key == null)
        {
         System.out.println("null key cannot be inserted");
        }

        key=key.toLowerCase();
        TrieNode currentNode=this.root;
        int index=0;

        for(int level=0;level<key.length();level++)
        {
             index=getIndex(key.charAt(level));
            if(currentNode.children[index]==null)
            {
                currentNode.children[index]=new TrieNode();
            }
          currentNode= currentNode.children[index];
        }
        currentNode.isEnd=true;
    }


    public boolean search(String key)
    {
        if(key== null)
            return false;
        key=key.toLowerCase();

        TrieNode currentNode=this.root;
        int index=0;

        for(int level=0;level<key.length();level++)
        {
            index=getIndex(key.charAt(level));
            if(currentNode.children[index]==null)
                return false;
            currentNode=currentNode.children[index];
        }
        if(currentNode.isEnd)
            return true;

        return false;

    }


   public  TrieNode delete(TrieNode root,String key, int i) {
       // TrieNode rootNode=root;
       if (search(key)) {
           if (root == null) return null;

           if (i == key.length()) {
               root.isEnd = false;
               if (isEmpty(root)) {
                   root = null;

               }
               return root;
           }

           int index = getIndex(key.charAt(i));

           root.children[index] = delete(root.children[index], key, i + 1);

           if (isEmpty(root) && root.isEnd == false) {
               root = null;
           }

       }
       else
           System.out.println("key not found");
       return root;
   }

   public boolean isEmpty(TrieNode root)

       {
         for(int i=0;i<26;i++)
         {
             if(root.children[i]!=null)
                 return false;
         }
         return true;
       }


    public void deletehelper(String key){
        if ((root == null) || (key == null)){
            System.out.println("Null key or Empty trie error");
            return;
        }
        delete(root, key, 0);
    }

 public  static void main(String args[]) {



     String keys[] = {"the", "a","hi","there"};
     String output[] = {"Not present in trie", "Present in trie"};
     Trie t= new Trie();

     System.out.println("Keys: " + Arrays.toString(keys));

     // Construct trie

     int i;
     for (i = 0; i < keys.length; i++)
         t.insert(keys[i]);

     // Search for different keys and delete if found
     boolean result= t.search("ab");
     System.out.println("is Element found:: ?? "+ result);

   t.deletehelper("hi");
     boolean deletionresult= t.search("hi");
     System.out.println("is Element found after deletion :: ?? "+ deletionresult);
 }



}
