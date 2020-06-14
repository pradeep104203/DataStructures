public class SinglyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
    }

    public Node head;
    public int size;
    public Node currentNode;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = head;
        head = newNode;
        size++;

    }

    public void display() {
        currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;


        }
    }


    public void insertAtEnd(T data) {
        if(isEmpty())
            return;

        Node newNode = new Node();
        newNode.data = data;
        currentNode = head;
        while (currentNode.nextNode != null) {

            currentNode = currentNode.nextNode;
        }

        currentNode.nextNode = newNode;
        newNode.nextNode = null;

    }

    public void insertAfter(T data,T previous)
    {
        if(isEmpty())
            return;

        Node newNode = new Node();
        newNode.data = data;
        currentNode = head;

        while (currentNode!=null &&!currentNode.data.equals(previous) )
        {

            currentNode = currentNode.nextNode;
        }

        newNode.nextNode=currentNode.nextNode;
        currentNode.nextNode= newNode;
        size++;
    }

      public boolean searchElement(T data)
      {
          if(isEmpty())
              return false;
          Node newNode = new Node();
          newNode.data = data;
          currentNode = head;

          while (currentNode!=null)
          {
                  if(currentNode.data.equals(data))
                  return true;
               currentNode=currentNode.nextNode;
          }
          return false;
      }

      public void deleteAtHead()
      {
          if(isEmpty())
              return;

          head=head.nextNode;

      }

      public void deleteAtEnd()
      {
          if(isEmpty())
              return;

          currentNode = head;

          while(currentNode.nextNode.nextNode!=null)
          {
              currentNode=currentNode.nextNode;
          }
          currentNode.nextNode=null;

      }

      public void deleteElement(T data)
      {
          if(isEmpty())
              return;


          if(head.data.equals(data))
          {
              deleteAtHead();
              return;
          }

          if(searchElement(data))
          {
              Node newNode = new Node();
              newNode.data = data;
              currentNode = head;


              while (currentNode != null) {

                  if (currentNode != null && currentNode.nextNode.data.equals(data)) {

                      currentNode.nextNode = currentNode.nextNode.nextNode;
                      return;
                  }

                  currentNode = currentNode.nextNode;

              }
          }
          System.out.println("element not found");

      }

    public static void main(String args[]) {

        SinglyLinkedList sl=new  SinglyLinkedList();
        //System.out.println(sl.isEmpty());


        sl.insertAtHead(40);

        sl.insertAtHead(50);
       // sl.display();

        sl.insertAtEnd(1);
        sl.insertAtEnd(2);

        //sl.display();

        sl.insertAfter(25,2);
        sl.insertAfter(99,25);
        sl.insertAfter(99,99);
        //sl.display();

        //System.out.println(sl.searchElement(10));
        //System.out.println(sl.searchElement(90));

        //sl.deleteAtHead();
        //sl.display();
       // sl.deleteAtEnd();
         sl.display();

       // sl.deleteElement(3);
        //sl.deleteElement(2);
        //sl.deleteElement(1);
        sl.deleteElement(50);

        sl.display();

    }
}
