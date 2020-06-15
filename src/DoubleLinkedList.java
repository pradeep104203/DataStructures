public class DoubleLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;

    }

    //member variables
    public Node currentNode;
    public Node headNode;
    public Node tailNode;
    public int size;

    //constructor
    public DoubleLinkedList() {
        this.headNode = null;
        this.tailNode = null; //null initially
        this.size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null && tailNode == null)
            return true;
        return false;
    }

    public Node getHeadNode() {
        return headNode;
    }

    //getter for tailNode
    public Node getTailNode() {
        return tailNode;
    }

    //getter for size
    public int getSize() {
        return size;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = headNode;
        newNode.prevNode = null;
        if (!isEmpty()) {
            headNode.prevNode = newNode;
        } else
            tailNode = newNode;
        this.headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node();
        newNode.data = data;
        Node temp = headNode;
        newNode.nextNode = null;
        newNode.prevNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
       // tailNode.nextNode=null;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty())
            return;

                headNode = headNode.nextNode;
                headNode.prevNode = null;
                size--;

        }


    public void deleteAtTail() {
        if (isEmpty())
            return;

            tailNode = tailNode.prevNode;
            tailNode.nextNode = null;
            size--;

    }

    public boolean searchByElement(T data)
    {
        if(isEmpty())
        return false;
        Node newNode = new Node();
        newNode.data = data;
        currentNode = headNode;

        while (currentNode!=null)
        {
            if(currentNode.data.equals(data)) {
                System.out.println("Element found");
                return true;
            }
            currentNode=currentNode.nextNode;
        }
        return false;
    }



    public void insertAfter(T data,T previous)
    {
        if(isEmpty())
            return;

        Node newNode = new Node();
        newNode.data = data;
        currentNode = headNode;

        while (currentNode!=null &&!currentNode.data.equals(previous) )
        {

            currentNode = currentNode.nextNode;
        }

        newNode.nextNode=currentNode.nextNode;
        currentNode.nextNode.prevNode= newNode;
        currentNode.nextNode= newNode;
        newNode.prevNode=currentNode;

        size++;
    }

    public void deleteElement(T data) {

            if (isEmpty()) {
                System.out.println("list empty");
                return;
            }


        if (headNode.data == data) {
            headNode = headNode.nextNode;
            headNode.prevNode = null;
        }
        else if (tailNode.data == data) {
            tailNode = tailNode.prevNode;
            tailNode.nextNode = null;
        }

        //if (searchByElement(data)) {

            else {
            Node newNode = new Node();
            newNode.data = data;
            currentNode = headNode;


            while (currentNode != null) {

                if (currentNode != null && currentNode.nextNode.data.equals(data)) {

                    currentNode.nextNode = currentNode.nextNode.nextNode;
                    currentNode.nextNode.prevNode = currentNode;
                    size--;
                    return;
                }

                currentNode = currentNode.nextNode;

            }
            System.out.println("element not found");
        }

        }


    public void display(){
        if(size==0) {
            System.out.println("List is Empty!");
            return;
        }
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = headNode;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }

        // System.out.println(temp.data.toString() + " -> null");
    }

    public static void main(String args[])
    {
        DoubleLinkedList dl= new DoubleLinkedList();
       // System.out.println(dl.isEmpty());
       // System.out.println(dl.getHeadNode());
        //System.out.println(dl.getTailNode());


        dl.insertAtHead(1);
        dl.insertAtHead(2);
        dl.insertAtHead(3);
        dl.insertAtHead(4);
        dl.insertAtHead(5);
        dl.insertAtEnd(6);
        dl.deleteAtHead();
        //dl.deleteAtHead();
        //dl.deleteAtHead();
        //dl.deleteAtHead();
        //dl.deleteAtHead();
          dl.deleteAtTail();
        //dl.insertAfter(100,4);
        //System.out.println(dl.searchByElement(2));


        //dl.deleteElement(5);
        //dl.deleteElement(4);
       // dl.deleteElement(3);
        //dl.deleteElement(2);
       // dl.deleteElement(1);
        System.out.println(dl.getSize());
       //System.out.println(dl.size);

        dl.display();

    }
}
