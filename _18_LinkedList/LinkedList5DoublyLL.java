public class LinkedList5DoublyLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // public LinkedList5DoublyLL() {
    //     this.head = null;
    //     this.tail = null;
    //     this.size = 0;
    // }

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Remove First
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int val = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Remove Last
    public int removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return -1;
        }
        int val = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // Reverse the Doubly Linked List
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr !=null){
            next=curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr=next;
        }
        head = prev;
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList5DoublyLL ll = new LinkedList5DoublyLL();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(5);
        ll.addLast(1);

        ll.printList();  // Output: 20 10 5 1

        System.out.println("Reversing the list...");
        ll.reverse();

        ll.printList();  // Output: 1 5 10 20
    }
}
