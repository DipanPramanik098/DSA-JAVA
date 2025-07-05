public class _04_LinearSearch {
    public static int ls(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
    // Time complexity = O(n)
    public static void main(String[] args) {
        int arr[] = {10,23,123,43,12,87};

        int key = 123;

        int index = ls(arr, key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("index = "+index);
        }
    }    
}
