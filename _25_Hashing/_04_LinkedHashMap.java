import java.util.LinkedHashMap;

public class _04_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();

        lhm.put("D",100);
        lhm.put("X",10);
        lhm.put("P",10000);
        lhm.put("G",20);

        System.out.println(lhm);
    }
}
