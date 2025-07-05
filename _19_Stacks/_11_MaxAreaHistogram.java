import java.util.*;

public class _11_MaxAreaHistogram {
    public static int maxArea(int height[]) {
        int maxArea = 0;
        
        int nsl[] = new int[height.length]; // next smaller to left
        int nsr[] = new int[height.length]; // next smaller to right

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek(); // <-- use INDEX, not height value
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek(); // <-- use INDEX, not height value
            }
            s.push(i);
        }

        // Calculate the maximum area
        for (int i = 0; i < height.length; i++) {
            int ht = height[i];
            int width = nsr[i] - nsl[i] - 1; // width between next smaller elements
            int currArea = ht * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(height)); // Output should be 10
    }
}
