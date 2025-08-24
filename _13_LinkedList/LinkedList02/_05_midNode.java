public class _05_midNode {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Add at last
    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Display list
    public void display() {
        System.out.println("=====================================");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("=====================================");
    }

    // Find mid node using slow-fast pointer
    public int midNode() throws Exception {
        if (head == null) {
            throw new Exception("Linked List is empty");
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        try {
            _05_midNode list = new _05_midNode();

            // Add elements
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addLast(40);
            list.addLast(50);

            System.out.println("Original Linked List:");
            list.display();

            int mid = list.midNode();
            System.out.println("Middle Node: " + mid);

            // Add one more element (even case)
            list.addLast(60);
            list.display();
            mid = list.midNode();
            System.out.println("Middle Node (after adding 60): " + mid);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
