public class Queue<V> {
    public int maxSize;
    public int currentSize;
    public V array[];
    public int front;
    public int back;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize)
    {
        this.maxSize=maxSize;
        array =(V[]) new Object[maxSize];
        front=0;
        back=-1;
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


    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void enQueue(V data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        back=(back+1)%maxSize;
        array[back]=data;
        currentSize++;
    }

    public V deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        V temp=array[front];
       front=(front+1)%maxSize;
        currentSize--;
        return temp;
    }

     public void display()
     {
         for(int i=0;i<currentSize;i++)
         {
             System.out.println(array[(front+i)%maxSize]);
         }
     }
    public static void main(String args[])
    {
        Queue q=new Queue(5);
        System.out.println("queue is empty or not"+q.isEmpty());
        System.out.println("queue is full or not"+q.isFull());
        System.out.println("maxsize is "+q.getMaxSize());
        System.out.println("current size is "+q.getCurrentSize());

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println("start of enqueue display");
        q.display();
        System.out.println("end of enqueue display");

        q.deQueue();
        System.out.println("start of dequeue display");
        q.display();
        System.out.println("end of dequeue display");


    }
}
