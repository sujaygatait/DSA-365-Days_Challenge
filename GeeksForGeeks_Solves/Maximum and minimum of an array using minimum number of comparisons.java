class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int min = arr[0];
        int max = arr[0];
        
        // for(int i=0; i<arr.length; i++) {
        //     min = Math.min(min, arr[i]);
        //     max = Math.max(max, arr[i]);
        // }
        
        int i=0, j=arr.length-1;
        while(i <= j) {
            min = Math.min(Math.min(arr[i], arr[j]), min);
            max = Math.max(Math.max(arr[i], arr[j]), max);
            
            i++;
            j--;
        }
        
        ans.add(min);
        ans.add(max);
        
        return ans;
    }
}
