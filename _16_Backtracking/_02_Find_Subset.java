
public class _02_Find_Subset {
    public static void findSubset(String s, String ans, int i){
        // base case 
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        // work
        // include 
        findSubset(s, ans+s.charAt(i), i+1);
        // exclude
        findSubset(s, ans, i+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        findSubset(s, "", 0);
    }    
}
 