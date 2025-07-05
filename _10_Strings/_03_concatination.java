public class _03_concatination {
    public static void print(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String fname = "Dipan";
        String lname = "Pramanik";

        // Concatination
        String fullName = fname + " " + lname;
        System.out.println(fullName);

        // finding character present at any index
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(12));

        System.out.println("================================================");
        print(fullName);
    }
}
