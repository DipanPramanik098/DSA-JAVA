import java.util.HashSet;
import java.util.Iterator;

public class _09_iteratorsHashSet {
    public static void main(String[] args) {
        HashSet<String>st = new HashSet<>();

        st.add("Dipan");
        st.add("Dipan1");
        st.add("Dipan12");
        st.add("Dipan123");
        st.add("Dipan1234");

        Iterator it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("=====");
        // using loop

        for(String s: st){
            System.out.println(s);
        }
    }    
}
