public class _01_findAllindices {

    public int[] findAll(int[] a, int size, int data, int count) {
        // Base Case: When we reach the end of the array
        if (size == a.length) {
            return new int[count]; // return empty array of size 'count'
        }

        int[] ansIndex;

        // If current element matches data
        if (a[size] == data) {
            ansIndex = findAll(a, size + 1, data, count + 1); // increment count
            ansIndex[count] = size; // store the index in reverse order
        } else {
            ansIndex = findAll(a, size + 1, data, count); // don't increment count
        }

        return ansIndex;
    }

    public static void main(String[] args) {
        _01_findAllindices obj = new _01_findAllindices();

        int[] a = { 1, 2, 3, 2, 4, 2, 5 };
        int data = 2;

        int[] indices = obj.findAll(a, 0, data, 0);

        // Print the result
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }
}
