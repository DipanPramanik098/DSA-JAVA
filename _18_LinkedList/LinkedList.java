public class LinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the list
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

    // Remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is Empty - nothing to delete");
            return;
        }
        if (head == tail) {
            int val = head.data;
            head = tail = null;
            System.out.println("Removed First Element: " + val);
            return;
        }
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        System.out.println("Removed First Element: " + val);
    }

    // Remove the last node
    public int removeLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        if (head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        return val;
    }

    // Iterative search
    public int searchElement(int key) {
        int pos = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Recursive search
    public static boolean searchRecursive(Node temp, int key) {
        if (temp == null) return false;
        if (temp.data == key) return true;
        return searchRecursive(temp.next, key);
    }

    // Reverse the linked list
    public void reverseLL() {
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
        head = prev;
    }

    // Delete nth node from end
    public void deleteNth(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int indexFromStart = size - n;
        Node prev = head;
        while (i < indexFromStart) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // Find middle node
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Check if list is palindrome
    public boolean checkPalindrome() {
        return checkPalindrome(this.head);
    }

    private boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find mid
        Node midNode = findMid(head);

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = midNode;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare both halves
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printList();
        ll.removeFirst();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.printList();
        ll.removeFirst();
        ll.printList();

        System.out.println(ll.searchElement(1));
        System.out.println(LinkedList.searchRecursive(ll.head, 3));
        ll.printList();
        
        System.out.println("Mid Element: " + ll.findMid(ll.head).data);
        System.out.println("Is Palindrome: " + ll.checkPalindrome());

        LinkedList ll1 = new LinkedList();
        ll1.addFirst(1);
        ll1.addFirst(2);
        ll1.addFirst(1);
        ll1.printList();
        System.out.println("Is Palindrome: " + ll1.checkPalindrome());
    }
}
