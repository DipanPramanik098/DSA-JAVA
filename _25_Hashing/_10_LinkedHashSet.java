import java.util.LinkedHashSet;

public class _10_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String>st = new LinkedHashSet<>();

        st.add("Dipan");
        st.add("Dipan2");
        st.add("Dipan1");
        st.add("Dipan112");
        st.add("Dipan112");

        System.out.println(st);
    }
}
