import java.util.TreeMap;

public class _05_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer>tm = new TreeMap<>();

        tm.put("D", 100);
        tm.put("X", 10);
        tm.put("P", 10000);
        tm.put("G", 20);

        System.out.println(tm);
    }
}
