
public class _10_lastOccuranceSearchFromFirst {
    public static int findLastOccurrence(int[] arr, int key, int index) {
        if (index == arr.length)
            return -1;

        int res = findLastOccurrence(arr, key, index + 1);

        if (res == -1 && arr[index] == key) {
            return index;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]  = {1,2,3,2,1,3,4,43,2,1,3,2,0};

        int key = 1;
        int index = 0;

        System.out.println(findLastOccurrence(arr, key, index));
    }    
}
