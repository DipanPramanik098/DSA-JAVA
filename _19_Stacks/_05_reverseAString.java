import java.util.*;
public class _05_reverseAString {
    public static String reverse(String s){
        Stack<Character>st = new Stack<>();
        int idx =0;
        while(idx < s.length()){
            st.push(s.charAt(idx));
            idx++;
        }

        StringBuilder str = new StringBuilder("");
        while(!st.isEmpty()){
           char curr = st.pop();
           str.append(curr); 
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String s = "dipanpramanik";
        String ans = reverse(s);
        System.out.println(ans);
    }
}
