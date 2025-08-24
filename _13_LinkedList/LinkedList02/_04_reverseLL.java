public class _04_reverseLL {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Display the linked list
    public void display() {
        System.out.println("=====================================");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("=====================================");
    }

    // Add node at last
    public void addLast(int data) {
        Node newElement = new Node();
        newElement.data = data;

        if (head == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
        size++;
    }

    // Get node at given index
    private Node getNodeAt(int idx) throws Exception {
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

    // Approach 1: Reverse LL by DATA swapping
    public void reverseByData() {
        int left = 0;
        int right = this.size - 1;

        while (left < right) {
            try {
                Node ln = getNodeAt(left);
                Node rn = getNodeAt(right);

                // swap data
                int temp = ln.data;
                ln.data = rn.data;
                rn.data = temp;

                left++;
                right--;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Approach 2: Reverse LL by POINTERS
    public void reverseByPointers() {
        Node prev = null;
        Node curr = head;
        tail = head; // old head becomes new tail

        while (curr != null) {
            Node ahead = curr.next; // save next node
            curr.next = prev; // reverse link
            prev = curr; // move prev forward
            curr = ahead; // move curr forward
        }

        head = prev; // new head
    }

    public static void main(String[] args) {
        _04_reverseLL list = new _04_reverseLL();

        // Add elements
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Original Linked List:");
        list.display();

        // Reverse by data
        list.reverseByData();
        System.out.println("After reverseByData:");
        list.display();

        // Reverse back by pointers
        list.reverseByPointers();
        System.out.println("After reverseByPointers:");
        list.display();
    }
}
