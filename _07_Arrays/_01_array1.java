public class _01_array1 {
    public static void main(String[] args) {
        // declaration 
        int [] arr = new int[5];
        System.out.println(arr);
        
        System.out.println(arr[0]);
        System.out.println(arr[2]);

        //update value 
        arr[0] =10;
        arr[1] =20;
        arr[2] =30; 
        arr[3] =40;
        arr[4] =50;
        System.out.println(arr[0]);
        System.out.println(arr[1]); //base add + (index * size of data type)

        int [] other = arr; // reference copy
        System.out.println(other[0]);
        other[0] = 100; // changing value in other will also change in arr
        System.out.println(arr[0]); // arr[0] will also be 100

        
    }
}
