
import java.util.*;

public class _10_DuplicateParenthesis {
    public static boolean solve(String s){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            // closing
            if(ch==')'){
                int count=0;
                while(!st.isEmpty() && st.peek() !='('){
                    st.pop();
                    count++;
                }
                if(count<1) return true;//Duplicate exist
                else{
                    st.pop();//pop opening bracket
                }
            }else{
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "((a+b))";
        String s2 = "(a-b)";
        System.out.println(solve(s1));
        System.out.println(solve(s2));
    }
}
