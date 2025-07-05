import java.util.*;
public class _09_ValidParentheses {
    public static boolean validParentheses(String s){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='(' ||s.charAt(i) =='{' || s.charAt(i) =='['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                if(s.charAt(i) ==')' && st.peek()=='('){
                    st.pop();
                }
                else if(s.charAt(i) =='}' && st.peek()=='{'){
                    st.pop();
                }
                else if(s.charAt(i) ==']' && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
                
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="({()})";
        String s1= "]}}";

        System.out.println(validParentheses(s));
        System.out.println(validParentheses(s1));
    }    
}
