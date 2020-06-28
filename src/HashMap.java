import java.util.ArrayList;

public class HashMap {


    ArrayList<HashEntry> bucket;
    private int slots;
    private int size;

    public HashMap() {
        bucket = new ArrayList <HashEntry>();
        slots = 5;
        size = 0;
        for (int i = 0; i < slots; i++) {
            bucket.add(null);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % slots;
        return index;
    }

    public void insert(String key, int value) {
        int b_Index = getIndex(key);
        HashEntry head = bucket.get(b_Index);



        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
    }
    head = head.next;
}




        size++;
        head = bucket.get(b_Index);
        HashEntry new_slot = new HashEntry(key, value);
        new_slot.next = head;
        bucket.set(b_Index, new_slot);

        if ((1.0 * size) / slots >= 0.6) {
            ArrayList<HashEntry> temp = bucket;
            bucket = new ArrayList();
            slots = 2 * slots;
            size = 0;
            for (int i = 0; i < slots; i++) {
                bucket.add(null);
            }
            for (HashEntry head_Node : temp) {
                while (head_Node != null) {
                    insert(head_Node.key, head_Node.value);
                    head_Node = head_Node.next;
                }
            }
        }
    }

    public int getValue(String key) {
        int b_Index = getIndex(key);
        HashEntry head = bucket.get(b_Index);
        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;

        }
        return -1;
    }

    public int delete(String key) {
        int b_Index = getIndex(key);
        HashEntry head = bucket.get(b_Index);
        HashEntry prev = null;

        while (head != null) {
            if (head.key.equals(key))
                break;
            prev = head;
            head = head.next;
        }

        if (head == null)
            return -1;
        size--;

        if (prev != null)
            prev.next = head.next;
        else
            bucket.set(b_Index, head.next);

        return head.value;
    }


    public static void main(String[] args) {
        HashMap table = new HashMap(); //Create a H ashTable
        //Before Insertion
        System.out.println("Table Size = " + table.size());
        table.insert("This", 1); //Key-Value Pair
        table.insert("is", 2);
        table.insert("a", 3);
        table.insert("is", 4);
        table.insert("Driver", 5);
        System.out.println("Table Size = " + table.size());
        // first search the key then delete it in the table
        // see the implementation first
        System.out.println(table.delete("is") + " : This key is deleted from table");
        System.out.println("Now Size of the table = " + table.size());
        if (table.isEmpty())
            System.out.println("Table is Empty");
        else
            System.out.println("Table is not Empty");


    }
}

