public class _08_LargestString {
    public static void main(String[] args) {
        // Lexicographic Order  -- a<b**
        String[] arr = {"Apple", "Banana", "Cherry", "Date"};
        String largest = arr[0];
        for(int i=1; i<arr.length; i++) {
            // O(x*n)  - x is the length of the largest String
            if(arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }
        System.out.println("The largest string is: " + largest);
    }
}
