
public class _04_searchInSortedMatrix {
    public static boolean find(int[][] arr, int key) {
        int row = 0;
        int cols = arr[0].length-1;

        // startpoint = arr[cols - 1][row];

        while(row<arr.length && cols>=0) {
            if(arr[row][cols] == key)  return true;
            else if(arr[row][cols]>key) cols--;
            else row++;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 33;

        System.out.println(find(arr, key));
    }
}
