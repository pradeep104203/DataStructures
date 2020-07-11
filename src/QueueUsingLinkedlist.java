public class QueueUsingLinkedlist<T> {
    public int currentSize;
    public int maxSize;
    class Node
    {
        private T data;
        Node next;

    }
    Node front;
    Node rear;

    QueueUsingLinkedlist(int maxSize)
    {
        this.maxSize=maxSize;
       this.front=null;
       this.rear=null;
        currentSize=0;
    }

    public boolean isEmpty()
    {

        return currentSize==0;
    }

    public boolean isFull()

    {
        return currentSize==maxSize;
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
          //x=front.data;
          front=front.next;
          currentSize--;
       }
       return front.data;
   }


    public static void main(String args[])
    {
        Queue q=new Queue(5);
        System.out.println("queue is empty  :::"+" "+q.isEmpty());
        System.out.println("queue is full  :::"+" "+q.isFull());
        System.out.println("maxsize is::"+" "+q.getMaxSize());
        System.out.println("current size is ::"+" "+q.getCurrentSize());

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println("start of enqueue display");
        q.display();
        System.out.println("end of enqueue display");

        System.out.println("queue is empty  :::"+" "+q.isEmpty());
        System.out.println("dequeued element is"+" "+q.deQueue());

        System.out.println("current size is ::"+" "+q.getCurrentSize());
        System.out.println("queue is empty  :::"+" "+q.isEmpty());
        System.out.println("start of dequeue display");
        q.display();
        System.out.println("end of dequeue display");


    }
}
