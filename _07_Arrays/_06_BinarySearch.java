public class _06_BinarySearch {
    public static int bs(int a[], int k){
        int start=0, end = a.length - 1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(a[mid] == k) return mid;
            else if(a[mid] > k){
                end = mid-1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }
    // Time Complexity = O(logn);
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int key = 4;

        System.out.println("index = "+bs(arr,key));
    }
}
