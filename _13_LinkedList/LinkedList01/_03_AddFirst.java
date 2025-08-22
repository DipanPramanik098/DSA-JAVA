public class _03_AddFirst {
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

    public static void main(String[] args) {
        _03_AddFirst list = new _03_AddFirst();

        // Add elements at the end
        list.addLast(20);
        list.addLast(30);

        // Add elements at the beginning
        list.addFirst(10);
        list.addFirst(5);

        // Display the linked list
        list.display();
    }
}
