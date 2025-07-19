import java.util.ArrayList;

public class _03_InsertInHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add a new element and heapify up recursively
        public void add(int data) {
            arr.add(data);
            heapifyUp(arr.size() - 1); // Start heapify from last index
        }

        // Return the minimum element (root)
        public int peek() {
            if (arr.isEmpty()) {
                System.out.println("Heap is empty!");
                return -1;
            }
            return arr.get(0);
        }

        // Remove the minimum element and heapify down recursively
        public int remove() {
            if (arr.isEmpty()) {
                System.out.println("Heap is empty!");
                return -1;
            }

            int min = arr.get(0); // Root element to return

            // Replace root with last element
            int last = arr.get(arr.size() - 1);
            arr.set(0, last);
            arr.remove(arr.size() - 1);

            // Heapify down from the root
            heapifyDown(0);

            return min;
        }

        // Print all heap elements
        public void print() {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // ✅ Recursive heapify up
        private void heapifyUp(int index) {
            if (index == 0)
                return; // Base case: reached root

            int parentIndex = (index - 1) / 2;

            // If current node is smaller than parent, swap and recurse
            if (arr.get(index) < arr.get(parentIndex)) {
                swap(index, parentIndex);
                heapifyUp(parentIndex); // Recurse on parent
            }
        }

        // ✅ Recursive heapify down
        private void heapifyDown(int index) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int minIndex = index;

            // Compare left child
            if (leftChild < arr.size() && arr.get(leftChild) < arr.get(minIndex)) {
                minIndex = leftChild;
            }

            // Compare right child
            if (rightChild < arr.size() && arr.get(rightChild) < arr.get(minIndex)) {
                minIndex = rightChild;
            }

            // If a child has a smaller value, swap and recurse
            if (minIndex != index) {
                swap(index, minIndex);
                heapifyDown(minIndex); // Recurse on the smaller child
            }
        }

        // Utility swap function
        private void swap(int i, int j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
    }

    public static void main(String[] args) {
        Heap minHeap = new Heap();

        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(4);
        minHeap.add(2);

        System.out.print("Heap: ");
        minHeap.print(); // Expected: valid Min-Heap order

        System.out.println("Peek: " + minHeap.peek()); // Output: 1

        System.out.println("Removed: " + minHeap.remove()); // Removes 1
        System.out.print("Heap after removal: ");
        minHeap.print(); // Min-Heap remains valid
    }
}
