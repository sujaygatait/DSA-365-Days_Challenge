class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        // calculate left max boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // calculate right max boundary - array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0; i<n; i++) {
            // WaterLevel = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // tapped water = water level - height of current bound
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}
