public class QueueUsingLinkedlist<T> {
    public int currentSize;
    public T x;

    class Node
    {
        private T data;
        Node next;

    }
    Node front;
    Node rear;

    QueueUsingLinkedlist()
    {

        this.front=null;
        this.rear=null;
        currentSize=0;
    }

    public boolean isEmpty()
    {

        return currentSize==0;
    }


    public void display()
    {

        if(front==null)
        {
            System.out.println("queue underflow");
        }
        else {
            Node temp = front;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void enqueue(T x)
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
            newNode.next=null;
            if(front==null) {
                front = rear = newNode;
                currentSize++;
            }
           else
               {
               rear.next=newNode;
               rear = newNode;
               currentSize++;
            }
        }

    }

   public T dequeue()
   {
       Node temp=new Node();
       if(front==null)
       System.out.println("queue is empty");
       else
       {
           x= front.data;
          front=front.next;
          currentSize--;
       }
       return x;
   }


    public static void main(String args[])
    {
        QueueUsingLinkedlist q=new QueueUsingLinkedlist();
        System.out.println("queue is empty  :::"+" "+q.isEmpty());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("start of enqueue display");
        q.display();
        System.out.println("end of enqueue display");

        System.out.println("queue is empty  :::"+" "+q.isEmpty());
        System.out.println("dequeued element is"+" "+q.dequeue());


        System.out.println("queue is empty  :::"+" "+q.isEmpty());
        System.out.println("start of dequeue display");
        q.display();
        System.out.println("end of dequeue display");


    }
}
