// Method-1
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = nums[0];
        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int divisor = -1;
        int low=1, high=max;
        while(low <= high) {
            int mid = low + (high-low)/2;

            int sum = 0;
            for(int i=0; i<n; i++) {
                if(nums[i] % mid == 0) sum += nums[i]/mid;
                else sum += nums[i]/mid + 1;
            }

            if(sum <= threshold) {
                divisor = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return divisor;
    }
}


// Method-2
class Solution {
    static boolean isLess(int[] nums, int mid, int threshold) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % mid == 0) sum += nums[i]/mid;
            else sum += nums[i]/mid + 1;
        }

        if(sum <= threshold) return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = nums[0];
        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int divisor = -1;
        int low=1, high=max;
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(isLess(nums, mid, threshold)) {
                divisor = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return divisor;
    }
}
