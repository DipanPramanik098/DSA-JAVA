
public class _01_first{

    public static void main(String[] args) {

        // declaration
        int arr[] = null;
        System.out.println(arr);
        
        // allocation space
        arr = new int[5];
        System.out.println(arr);

        // get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // set
        arr[0] = 10;
        arr[1] = 20;
        arr[2]= 30;
        arr[3]= 40;
        arr[4]= 50;

        // Print array 
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("=================================");
        // todo: enhanced for loop
        for(int val : arr){
            System.out.println(val);
        }
    }

}
