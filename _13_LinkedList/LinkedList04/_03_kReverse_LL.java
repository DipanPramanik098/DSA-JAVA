import java.util.Scanner;

public class _03_kReverse_LL {
    /*
     * Given a head to Linked List L, write a function to reverse the list taking k
     * elements at a time. Assume k is a factor of the size of List.
     * 
     * You need not have to create a new list. Just reverse the old one using head.
     * 
     * 
     * Input Format
     * The first line contains 2 space separated integers N and K
     * 
     * The next line contains N space separated integral elements of the list.
     * 
     * 
     * Constraints
     * 0 <= N <= 10^6 0 <= K <= 10^6
     * 
     * 
     * Output Format
     * Display the linkedlist after reversing every k elements
     * 
     * 
     * Sample Input
     * 9 3
     * 9 4 1 7 8 3 2 6 5
     * Sample Output
     * 1 4 9 3 8 7 5 6 2
     * Explanation
     * N = 9 & K = 3
     * 
     * Original LL is : 9 -> 4 -> 1 -> 7 -> 8 -> 3 -> 2 -> 6 -> 5
     * 
     * After k Reverse : 1 -> 4 -> 9 -> 3 -> 8 -> 7 -> 5 -> 6 -> 2
     */    
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Add element at end
    public void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Reverse linked list in groups of k
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node();
        dummy.next = head;
        Node groupPrev = dummy;

        while (true) {
            Node kth = getKthNode(groupPrev, k);
            if (kth == null) break;

            Node groupNext = kth.next;

            // reverse group
            Node prev = kth.next;
            Node curr = groupPrev.next;

            while (curr != groupNext) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            Node temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }

        return dummy.next;
    }

    // Helper to get kth node from current
    private Node getKthNode(Node curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    // Print list
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        _03_kReverse_LL ll = new _03_kReverse_LL();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ll.addLast(value);
        }

        ll.head = ll.reverseKGroup(ll.head, k);
        ll.display(ll.head);
    }
}
