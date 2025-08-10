public class _10_spiralMatrix {
    // https://leetcode.com/problems/spiral-matrix/description
    public static void spiralPrint(int [][] matrix){
        int sr = 0, sc = 0;
        int er = matrix.length - 1, ec = matrix[0].length - 1;
        int totalElements = matrix.length * matrix[0].length;
        int count = 0;

        while (count < totalElements) {
            // Print top row
            for (int i = sc; i <= ec && count < totalElements; i++) {
                System.out.print(matrix[sr][i] + " ");
                count++;
            }
            sr++;

            // Print right column
            for (int i = sr; i <= er && count < totalElements; i++) {
                System.out.print(matrix[i][ec] + " ");
                count++;
            }
            ec--;

            // Print bottom row
            for (int i = ec; i >= sc && count < totalElements; i--) {
                System.out.print(matrix[er][i] + " ");
                count++;
            }
            er--;

            // Print left column
            for (int i = er; i >= sr && count < totalElements; i--) {
                System.out.print(matrix[i][sc] + " ");
                count++;
            }
            sc++;
            
        }
    }
    public static void main(String[] args) {
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [1,2,3,6,9,8,7,4,5]
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        spiralPrint(matrix);

    }
}
