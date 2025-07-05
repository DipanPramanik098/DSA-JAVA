public class _13_trappingRainwater {
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;
        
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trapwater += waterlevel - height[i];
        }
        
        return trapwater;
    }
    
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(height);
        System.out.println("Trapped rainwater: " + trappedWater);
    }
}
