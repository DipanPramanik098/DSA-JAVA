public class _09_searchInaTwoDTwo {
    // https://leetcode.com/problems/search-a-2d-matrix-ii/description/

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        return false; // Target not found
    }
    public static void main(String[] args) {
        // Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true

        int [][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int target = 5;

        _09_searchInaTwoDTwo obj = new _09_searchInaTwoDTwo();
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}
