import java.util.HashMap;
import java.util.Set;

public class _02_iterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();

        hm.put("A",100);
        hm.put("B",200);
        hm.put("C",210);
        hm.put("D",21);
        hm.put("E",2100);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + " -> " + hm.get(k));
        }
    }    
}
