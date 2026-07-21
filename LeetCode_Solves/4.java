class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        int i=0, j=0;
        int[] mergedArray = new int[m+n];

        int idx = 0;
        while(i<m && j<n)
        {
            if(nums1[i] <= nums2[j]) mergedArray[idx++] = nums1[i++];
            else mergedArray[idx++] = nums2[j++];
        }
        while(i<m) mergedArray[idx++] = nums1[i++];
        while(j<n) mergedArray[idx++] = nums2[j++];

        if((m+n)%2 != 0) return mergedArray[(m+n)/2];
        else return (mergedArray[(m+n)/2-1] + mergedArray[(m+n)/2])/2.0;
    }
}
