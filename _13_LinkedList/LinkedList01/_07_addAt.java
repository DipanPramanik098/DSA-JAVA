public class _07_addAt {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Traverse Linked List
    public void display() {
        System.out.println("=====================================");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("=====================================");
    }

    // Add Last
    public void addLast(int data) {
        Node newElement = new Node();
        newElement.data = data;

        if (head == null) {
            head = tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
        size++;
    }

    // Add First
    public void addFirst(int item) {
        Node newNode = new Node();
        newNode.data = item;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Get Node at index
    private Node getNodeAt(int idx) throws Exception {
        if (head == null)
            throw new Exception("Linked List is Empty");
        if (idx < 0 || idx >= size)
            throw new Exception("Index Out Of Bound");

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Add at a specific index
    public void addAt(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Index Out Of Bound");
        }

        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node prev = getNodeAt(index - 1);
            Node newElement = new Node();
            newElement.data = item;

            newElement.next = prev.next;
            prev.next = newElement;
            size++;
        }
    }

    public static void main(String[] args) {
        try {
            _07_addAt list = new _07_addAt();

            // Add elements
            list.addLast(10);
            list.addLast(20);
            list.addLast(40);

            // Insert at beginning
            list.addAt(5, 0);

            // Insert in the middle
            list.addAt(30, 3);

            // Insert at end
            list.addAt(50, 5);

            // Display
            list.display();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
