public class _04_pattern4 {
    public static void main(String[] args) {
        // A
        // BC
        // DEF
        // GHIJ
        char ch = 'A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }    
}
