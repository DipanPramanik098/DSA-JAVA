public class _06_getAt {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Note: Traverse in Linked List
    public void display() {
        System.out.println("=====================================");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("=====================================");
    }

    // Note: Add Last
    public void addLast(int data) {
        Node newElement = new Node();
        newElement.data = data;
        newElement.next = null;

        if (head == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
        size++;
    }

    // Note: Add First
    public void addFirst(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Note: Get Element at index
    public int getAt(int idx) throws Exception {
        if (head == null) {
            throw new Exception("Linked List is Empty");
        }
        if (idx < 0 || idx >= size) {
            throw new Exception("Index Out Of Bound");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }


    // Note: Get Element at index
    private  Node getNodeAt(int idx) throws Exception {
        if (head == null) {
            throw new Exception("Linked List is Empty");
        }
        if (idx < 0 || idx >= size) {
            throw new Exception("Index Out Of Bound");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        try {
            _06_getAt list = new _06_getAt();

            // Adding elements
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addLast(40);

            // Display the list
            list.display();

            // Get elements at specific indices
            System.out.println("Element at index 0: " + list.getAt(0));
            System.out.println("Element at index 2: " + list.getAt(2));
            System.out.println("Element at index 3: " + list.getAt(3));
            System.out.println("Element at index 3: " + list.getAt(7));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
