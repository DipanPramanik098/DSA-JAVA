public class _06_isSorted {
    public static boolean isSorted(int[] arr, int i) {
        if(i==arr.length-1) return true;

        if(arr[i]>arr[i+1]) return false;

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5,6,7};
        System.out.println(isSorted(a1, 0));
        int a2[] = {7,6,5,4,3,2,1};
        System.out.println(isSorted(a2, 0));
    }
}
