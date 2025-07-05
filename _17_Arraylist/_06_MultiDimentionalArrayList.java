import java.util.*;

public class _06_MultiDimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(22);
        mainList.add(list);
        mainList.add(list2);
        
        System.out.println(mainList);

        // Nested Loop
        for (ArrayList<Integer> subList : mainList) {
            for (Integer num : subList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // nested loop
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
