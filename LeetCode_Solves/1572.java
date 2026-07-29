class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
  
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += mat[i][i];

            if(i+i == n-1) continue; // this condition will tackle the overlapping case
            
            sum += mat[i][n-i-1];
            
        }
 
        return sum;
    }
}
