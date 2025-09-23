 
public class _03_Palindromic_Substrings {
    // https://leetcode.com/problems/palindromic-substrings/description/   

    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(CountPalindromic(s));
    }

    public static int CountPalindromic(String s){
        int count = 0;
        // concept - axis orbit
        //odd
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
					break;
				}
				count++;
			}

		}
		//even
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
					break;
				}
				count++;
			}
        }
        return count;
    }
}
