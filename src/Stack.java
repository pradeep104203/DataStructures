public class Stack<V> {
    public int maxSize;
    public V array[];
    public int top;

    @SuppressWarnings("unchecked")
    public Stack(int max_Size)
    {
        this.maxSize=max_Size;
        top=-1;
        array = (V[])new Object[max_Size];
    }

    public boolean isEmpty()
    {
        if(top==-1)
        return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if(top==maxSize-1)
        return true;
        else
            return false;
    }

    public void push(V data)
    {

        if(isFull())
        {
            System.out.println("Stack is full");
            return;
        }
        array[++top]=data;
    }

    public V pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        return array[top--];

    }

    public V top()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        return array[top];
    }

    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(array[i]);
        }
    }

   public static void main(String args[])
   {
       Stack sk=new Stack(6);
       System.out.println(sk.isEmpty());
       System.out.println(sk.isFull());

       sk.push(1);
       sk.push(2);
       sk.push(3);
       sk.push(4);
       sk.push(5);
      sk.push("pradeep new commit");


       sk.display();
       System.out.println("END OF PUSH");
      // System.out.println(sk.top());

      // System.out.println(sk.pop(5));
       sk.pop();
       sk.display();
   }

}
