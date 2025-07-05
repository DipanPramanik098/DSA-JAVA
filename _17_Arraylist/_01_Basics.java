import java.util.ArrayList;

public class _01_Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        // Operations
        // note: ADD Elements 
        list.add(1);    
        list.add(2);    
        list.add(3);    
        list.add(4);    
        list.add(5);
        System.out.println(list);    

        list.add(0,101);
        System.out.println(list);
        // note:Get Elements
        System.out.println(list.get(3));

        // note : Remove Elements
        list.remove(3);
        System.out.println(list);

        // set elements at index
        list.set(2,10);
        System.out.println(list);

        // contains element
        System.out.println(list.contains(10));
        System.out.println(list.contains(101));


        // size
        System.out.println(list.size());

        // print
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
