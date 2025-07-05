public class _10_removeDuplicateFromString {
    public static void solve(String str, int idx, StringBuilder ans, boolean[] hashh){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }

        char currChar = str.charAt(idx);
        if(hashh[currChar - 'a'] == true){
            // duplicate found
            solve(str, idx+1, ans, hashh);
        }else{
            // add to ans and update hash
            hashh[currChar - 'a'] =true;
            ans.append(currChar);
            solve(str, idx+1, ans, hashh);
        }
    }
    public static void main(String[] args) {
        String str = "dipanpramanik";

        solve(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
