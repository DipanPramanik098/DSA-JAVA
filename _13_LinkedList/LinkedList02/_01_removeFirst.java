public class _01_removeFirst {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // note : Traverse in LL
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

        if (head == null) {
            // no element present
            head = newElement;
            tail = newElement;
            size++;
        } else {
            // element present
            tail.next = newElement;
            tail = newElement;
            size++;
        }
    }

    public int removeFirst() throws Exception {
        // if ll is empty
        if (head == null) {
            throw new Exception("Linked List is empty, can't remove");
        }

        int data = head.data;
        // if only one element is present
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return data;
        }

        // if more than one element is present
        head = head.next;
        size--;
        return data;
    }

    public static void main(String[] args) {
        try {
            _01_removeFirst list = new _01_removeFirst();

            // Adding elements
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addLast(40);

            System.out.println("Original Linked List:");
            list.display();

            // Removing first element
            int removed = list.removeFirst();
            System.out.println("Removed First Element: " + removed);

            System.out.println("After removeFirst:");
            list.display();

            // Remove more elements
            removed = list.removeFirst();
            System.out.println("Removed First Element: " + removed);

            System.out.println("After removeFirst again:");
            list.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
