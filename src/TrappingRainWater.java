public class TrappingRainWater {

    public static int rainWaterTrap(int[] height){
        int n = height.length;
        // Left max water level
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Right max water level
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        // LOOP
        for (int i = 0; i < height.length; i++) {
            // calculate water level = min(leftmax, rightmax)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // calculate trapped water = waterlevel-height
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rainWaterTrap(height));
    }
}
