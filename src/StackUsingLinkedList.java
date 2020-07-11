public class StackUsingLinkedList<T> {


    class Node
    {
        private T data;
        Node next;
    }

    Node top;
    StackUsingLinkedList()
    {
     this.top=null;
    }

    public boolean isEmpty()
    {
        return top==null;
    }

   public boolean isFull()
   {
       Node temp=new Node();
       return temp==null;
   }

   public T peek()
   {
       if(!isEmpty()) {
           return top.data;
       }
       else
           System.out.println("Stack is empty");
          return null;
   }

   public void push(T x)
   {
      Node newNode=new Node();
      if(newNode == null)
      {
          System.out.println("Heap overflow");
          return;
      }
     else
      {
          newNode.data=x;
          newNode.next=top;
          top=newNode;
      }

   }

   public void pop()
   {
       if(top==null)
       {
           System.out.println("Stack under flow");
       }
       else
       {
           top=top.next;
       }

   }

    public void display()
    {

        if(top==null)
        {
            System.out.println("Stack underflow");
        }
        else {
            Node temp = top;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public boolean search( T data)
    {
        Node temp=top;

        while(temp!=null)
        {
            if(temp.data.equals(data))
                return true;
              temp=temp.next;

        }
       return false;
    }

    public static void main(String args[])
    {
        StackUsingLinkedList sll=new StackUsingLinkedList();

        sll.push(11);
        sll.push(12);
        sll.push(13);
        sll.push(14);
        sll.push(15);
        sll.display();
        System.out.println("isFull");
         System.out.println(sll.isFull());
        System.out.println("isempty");
         System.out.println(sll.isEmpty());
         System.out.println("peek element is "+"  "+sll.peek());
         sll.pop();
         System.out.println("elements after pop operation");
         sll.display();
         boolean result=sll.search(12);
         System.out.println("is Element found ??"+ " "+result);


    }

}
