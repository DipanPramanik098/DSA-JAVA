public class _01_implement {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    // note : Traverse in LL
    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        
    }
}