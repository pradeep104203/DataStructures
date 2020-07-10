public class TrieNode{

    TrieNode[] children;
    boolean isEnd;
    static int ALPHABET_SIZE=26;

    TrieNode()
    {
        this.isEnd=false;
        this.children=new TrieNode[ALPHABET_SIZE];
    }

}
