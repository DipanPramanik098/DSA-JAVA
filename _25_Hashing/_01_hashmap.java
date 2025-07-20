import java.util.HashMap;

public class _01_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();

        // put
        hm.put("Dipan",1);
        hm.put("A",10);
        hm.put("B",101);

        System.out.println(hm);

        // get
        System.out.println(hm.get("Dipan"));

        // containsKey
        System.err.println(hm.containsKey("A"));
        System.err.println(hm.containsKey("VVV"));

        // remove
        hm.remove("A");
        System.out.println(hm);
        // size
        System.out.println(hm.size());
        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
    }    
}
