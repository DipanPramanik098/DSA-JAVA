public class _10_upperCase {
    public static String toUppercase(String s){
        StringBuilder sb = new StringBuilder("");

        // change the first letter
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1; i<s.length(); i++){

            // check if space found then change the next letter after space
            if(s.charAt(i) == ' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "hi, i am dipan";

        // output - Hi, I Am Dipan;
        System.out.println(toUppercase(s));

        
    }
}
