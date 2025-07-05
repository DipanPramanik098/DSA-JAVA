public class LinkedList4ZigZag {
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
    // Reverse the linked list
    public Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public void ZigZag(){
        // find mid
        Node mid = getMid(head);
        // reverse 2nd half
        Node curr = mid.next;
        mid.next=null;

        Node leftHead= head;
        Node rightHead = reverseLL(curr);


        Node nextLeft, nextRight;

        // alternate merge
        while (leftHead != null && rightHead != null) {
            nextLeft = leftHead.next;
            leftHead.next = rightHead;
            nextRight = rightHead.next;
            rightHead.next = nextLeft;
    
            leftHead = nextLeft;
            rightHead = nextRight;
        }
    
    }
    public static void main(String[] args) {
        LinkedList4ZigZag ll = new LinkedList4ZigZag();
        
        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);
        ll.head.next.next = ll.new Node(3);
        ll.head.next.next.next = ll.new Node(4);
        ll.head.next.next.next.next = ll.new Node(5);
    
        // Before ZigZag
        System.out.println("Original Linked List:");
        printList(ll.head);
    
        // Perform ZigZag rearrangement
        ll.ZigZag();
    
        // After ZigZag
        System.out.println("ZigZag Linked List:");
        printList(ll.head);
    }
    
    // Helper function to print the list
    public static void printList(LinkedList4ZigZag.Node head) {
        LinkedList4ZigZag.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
