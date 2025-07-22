import java.util.HashSet;

public class _13_unionAndIntersection {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {3,4,5,7};

        // Union
        HashSet<Integer>st = new HashSet<>();

        for(int i=0; i<a.length;i++){
            st.add(a[i]);
        }

        for(int i=0; i<b.length;i++){
            st.add(b[i]);
        }

        System.out.println("Union "+st.size());

        st.clear();
        // Intersection
        for (int i = 0; i < a.length; i++) {
            st.add(a[i]);
        }

        int count = 0;

        for (int i = 0; i < b.length; i++) {
            if(st.contains(b[i])){
                count++;
                st.remove(b[i]);
            }
        }
        System.out.println("Intersection "+count);
    }
}
