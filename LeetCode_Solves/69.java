class Solution {
    public int mySqrt(int x) {
        long low = 0, high = x;
        while(low <= high) {
            long mid = low + (high-low)/2;

            long a = mid*mid;
            if(a == x) return (int)mid;
            else if(a > x) {
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return (int)high;
    }
}
