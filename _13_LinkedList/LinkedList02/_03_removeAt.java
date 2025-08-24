public class _03_removeAt {
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
        if (head == null) {
            throw new Exception("Linked List is empty, can't remove");
        }

        int data = head.data;
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return data;
        }

        head = head.next;
        size--;
        return data;
    }

    public int removeLast() throws Exception {
        if (head == null) {
            throw new Exception("Linked List is empty, can't remove");
        }

        if (head == tail) {
            int data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int data = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return data;
    }

    // removeAt: delete node at given index
    public int removeAt(int index) throws Exception {
        if (head == null || index >= size || index < 0) {
            throw new Exception("Invalid request");
        }

        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }

        // traverse to node just before target
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node target = prev.next; // node to delete
        int data = target.data;
        prev.next = target.next;
        target.next = null;
        size--;
        return data;
    }

    public static void main(String[] args) {
        try {
            _03_removeAt list = new _03_removeAt();

            // Adding elements
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addLast(40);
            list.addLast(50);

            System.out.println("Original Linked List:");
            list.display();

            // Remove at index 2 (should remove 30)
            int removed = list.removeAt(2);
            System.out.println("Removed Element at index 2: " + removed);

            System.out.println("After removeAt(2):");
            list.display();

            // Remove at index 0 (should remove 10)
            removed = list.removeAt(0);
            System.out.println("Removed Element at index 0: " + removed);

            System.out.println("After removeAt(0):");
            list.display();

            // Remove at last index
            removed = list.removeAt(list.size - 1);
            System.out.println("Removed Last Element: " + removed);

            System.out.println("After removing last element:");
            list.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
