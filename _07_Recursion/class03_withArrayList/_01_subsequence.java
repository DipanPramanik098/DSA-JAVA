
import java.lang.reflect.Array;
import java.util.ArrayList;

public class _01_subsequence {
    // todo: subsequence
    public static ArrayList<String> subseq(String s){
        if(s.length() == 0){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }

        char curr_char = s.charAt(0);
        String rest_Of_s = s.substring(1);
        ArrayList<String> myResult = new ArrayList<>();

        ArrayList<String> recResult = subseq(rest_Of_s);
        for(int i = 0; i<recResult.size(); i++){
            myResult.add(recResult.get(i));
            myResult.add(curr_char + recResult.get(i));
        }
        return  myResult;

    }
    public static void main(String[] args) {
        String s = "abc";

        ArrayList<String>ans = subseq(s);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
