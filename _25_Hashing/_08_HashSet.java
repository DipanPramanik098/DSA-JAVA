import java.util.HashSet;

public class _08_HashSet {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(23);

        System.out.println(set);
        System.out.println(set.size());

        set.remove(2);

        System.out.println(set.contains(2));
    }
    
}
