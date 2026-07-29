class Solution {
    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=0; i<n/2; i++) {
            swap(arr, i, n-i-1);
        }
    }
}
