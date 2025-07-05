public class _07_reverseArray {
    public static void reverse(int a[]){
        int s=0, e= a.length-1;
        while(s<e){
            int temp = a[s];
            a[s]=a[e];
            a[e] = temp;

            s++;
            e--;
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        print(arr);

        reverse(arr);
        System.out.println();
        print(arr);
    }
}
