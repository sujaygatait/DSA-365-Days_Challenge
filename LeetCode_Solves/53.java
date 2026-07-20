class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxNegativeNumber = Integer.MIN_VALUE;
        boolean allPositive = false;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) allPositive = true;
            maxNegativeNumber = Math.max(maxNegativeNumber, nums[i]);

            currentSum += nums[i];
            if(currentSum < 0) currentSum = 0;

            maxSum = Math.max(maxSum, currentSum);
        }

        if(allPositive == false) return maxNegativeNumber;
        
        return maxSum; 
    }
}
