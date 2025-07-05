import java.util.*;
public class _08_nextGreaterElement {

    public static void main(String[] args) {
        int a[] = {1,2,1};
        Stack<Integer>st = new Stack<>();
        int nextGreater[] = new int[a.length];

        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()] <= a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = a[st.peek()];
            }

            st.push(i);
        }
        for(int i=0;i<a.length;i++){
            System.out.println(nextGreater[i]+" ");
        }
    }
}
