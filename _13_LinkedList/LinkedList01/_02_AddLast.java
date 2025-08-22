
public class _02_AddLast {
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
    public void addLast(int data){
        Node newElement = new Node();
        newElement.data = data;

        if(head == null){
            // no element present
            head = newElement;
            tail = newElement;
            size++;
        }else{
            // element presents
            tail.next = newElement;
            tail = newElement;
            size++;
        }
    } 
    public static void main(String[] args) {
        _02_AddLast list = new _02_AddLast();

        list.display();

        list.addLast(10);
        list.display();

        list.addLast(20);
        list.display();

        list.addLast(30);
        list.display();
    }
}
