import java.util.*;
public class _03_find_Max {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

    a.add(2);
    a.add(5);
    a.add(9);
    a.add(3);
    a.add(6);

    int maxi = Integer.MIN_VALUE;

    for(int i=0;i<a.size(); i++){
        maxi = Math.max(maxi, a.get(i));
    }
    System.out.println(maxi);
    }

}
