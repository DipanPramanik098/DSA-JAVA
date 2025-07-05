public class _09_continueKeyword {
    public static void main(String[] args) {
        // skip an iteration
        for(int i=1;i<=10;i++){
            if(i==3) continue; 
            System.out.println(i);
        }
    }    
}
