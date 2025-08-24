public class _03_kthNode_fromEND {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Kth node from end (two pointers)
    public int kthFromEnd(int k) throws Exception {
        if (k <= 0 || k > size) {
            throw new Exception("Invalid k: " + k);
        }

        Node fast = head;
        Node slow = head;

        // move fast k steps ahead
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // move both until fast reaches null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    // Main test
    public static void main(String[] args) throws Exception {
        _03_kthNode_fromEND list = new _03_kthNode_fromEND();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.display(); // 10 -> 20 -> 30 -> 40 -> 50 -> NULL

        System.out.println("2nd Node from End: " + list.kthFromEnd(2)); // 40
        System.out.println("5th Node from End: " + list.kthFromEnd(5)); // 10
    }
}
