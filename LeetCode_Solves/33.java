class Solution {
    public int binarySearch(int[] nums, int start, int end, int target) {
        int low=start, high=end;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else high = mid - 1;
        }

        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;

        if(n <= 2) {
            for(int i=0; i<n; i++) {
                if(nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        int pivot = -1; 
        int low=1, high=n-2;
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
                pivot = mid;
                break;
            }
            else if(nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]) {
                pivot = mid - 1;
                break;
            }
            else if(nums[mid-1]<nums[mid] && nums[mid]<nums[mid+1]) {
                if(nums[mid] > nums[n-1]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        if(pivot == -1) {
            return binarySearch(nums, 0, n-1, target);
        }

        int idx1 = binarySearch(nums, 0, pivot, target);
        if(idx1 != -1) return idx1;
        int idx2 = binarySearch(nums, pivot+1, n-1, target);
        if(idx2 != -1) return idx2;

        return -1;
    }
}
