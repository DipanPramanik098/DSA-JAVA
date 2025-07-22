import java.util.HashSet;

public class _12_CountDistinctEle {

    public static void main(String[] args) {
        int nums [] = {4,3,2,1,1,3,4,5,6,7,8,5,4};
        
        HashSet<Integer>st = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }

        System.out.println(st.size());
    }
}
