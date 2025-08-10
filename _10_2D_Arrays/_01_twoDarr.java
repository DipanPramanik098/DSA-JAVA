public class _01_twoDarr {

    //note: int [][] arr = new int[m][n]; - #1D array -> (m+1)

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = new int [3][4];
        
        // 3 rows, 4 columns
        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[1][2]);

        int [][] other = arr; // shallow copy
        System.out.println(other);

        display(arr);
    }    
}
