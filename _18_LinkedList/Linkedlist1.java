public class Linkedlist1 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void printList() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;
    
        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                flag = true;
                break;
            }
        }
    
        if (!flag)
            return; // No cycle found
    
        slow = head;
    
        // Special case: if cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
    
        // General case
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        Linkedlist1 list = new Linkedlist1(); // create object
        list.head = list.new Node(1);
        Node temp = list.new Node(2); // fixed: use list.new Node(2)

        list.head.next = temp; // fixed: use list.head

        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.head; // creating a cycle manually

        if (list.isCycle()) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle detected.");
        }

        list.removeCycle(); // Remove cycle

        list.printList(); // Should now print the list properly without infinite loop
    }
}
