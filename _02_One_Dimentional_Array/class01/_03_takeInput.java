
import java.util.Scanner;


public class _03_takeInput {
    static  Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        System.out.println("Enter Size ");
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter Value of index " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void display(int arr[]){
        System.out.println("Displaying Your Array ---> ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr = takeInput();

        display(arr);
    }    
}
