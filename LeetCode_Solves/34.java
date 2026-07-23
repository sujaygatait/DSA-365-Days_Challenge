class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        boolean check1 = false, check2 = false;
        int low = 0, high = nums.length-1;
        ans[0] = nums.length;
        // finding first position
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                check1 = true;
                ans[0] = Math.min(mid, ans[0]);
                high = mid - 1;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else high = mid - 1;
        }

        ans[1] = -1;
        low=0; high=nums.length-1;
        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] == target) {
                check2 = true;
                ans[1] = Math.max(ans[1], mid);
                low = mid + 1;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else high = mid - 1;
        }

        if(check1==false) {
            ans[0] = -1;
        }
        if(check2 == false) {
            ans[1] = -1;
        }

        return ans;
    }
}
