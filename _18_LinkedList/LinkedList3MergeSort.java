
public class LinkedList3MergeSort {
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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;
        // find mid
        Node mid = getMid(head);
        // left & right part call
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);// left
        Node newRight = mergeSort(rightHead);// right

        // Merge
        return merge(newLeft, newRight);
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList3MergeSort ll = new LinkedList3MergeSort();
        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(9);
    
        System.out.println("Original List:");
        ll.printList(ll.head);
    
        ll.head = ll.mergeSort(ll.head);
    
        System.out.println("Sorted List:");
        ll.printList(ll.head);
    }
}
