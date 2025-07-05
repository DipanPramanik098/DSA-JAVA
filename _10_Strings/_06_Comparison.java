public class _06_Comparison {
    public static void main(String[] args) {
        String s1 = "Dipan";
        String s2 = "Dipan";
        String s3 = new String("Dipan");

        // Here Equal - s1 & s2 point to a same string
        if(s1==s2){
            System.out.println("Equal");
        }else System.out.println("Not Equal");


        // Here Not Equal
        if(s1==s3) System.out.println("Equal");
        else System.out.println("Not Equal");
        // but 
        if(s1.equals(s3)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}
