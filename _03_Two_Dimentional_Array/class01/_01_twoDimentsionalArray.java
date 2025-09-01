public class _01_twoDimentsionalArray {

    public static void main(String[] args) {
        // 1️⃣ Initialization

        // Method 1: Static initialization
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Method 2: Dynamic initialization
        int[][] arr2 = new int[3][3]; // 3x3 array
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[1][0] = 30; // etc.

        // 2️⃣ Access elements
        System.out.println("Element at arr1[1][2]: " + arr1[1][2]); // 6

        // 3️⃣ Update elements
        arr1[2][1] = 99;
        System.out.println("Updated arr1[2][1]: " + arr1[2][1]); // 99

        // 4️⃣ Get element (same as access)
        int value = arr1[0][2];
        System.out.println("Value at arr1[0][2]: " + value); // 3

        // 5️⃣ Print entire 2D array
        System.out.println("Printing arr1:");
        print2DArray(arr1);

        System.out.println("Printing arr2:");
        print2DArray(arr2);
    }

    // Function to print any 2D array
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // Iterate over rows
            for (int j = 0; j < arr[i].length; j++) { // Iterate over columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
