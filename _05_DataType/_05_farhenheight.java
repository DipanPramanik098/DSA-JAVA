import java.util.Scanner;

public class _05_farhenheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minf = sc.nextInt(); // Minimum Fahrenheit
        int maxf = sc.nextInt(); // Maximum Fahrenheit
        int step = sc.nextInt(); // Step size

        for(int i= minf; i<= maxf; i += step) {
            double celsius = (int)((i - 32) * 5.0 / 9.0); // Convert Fahrenheit to Celsius
            System.out.println(i + "\t" + celsius); // Print formatted output
        }   
    }    
}
