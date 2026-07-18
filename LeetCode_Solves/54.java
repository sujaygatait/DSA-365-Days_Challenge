class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minR=0, maxR=matrix.length-1;
        int minC=0, maxC=matrix[0].length-1;

        ArrayList<Integer> ans = new ArrayList<>();

        while(minR<=maxR && minC<=maxC) {
            for(int j=minC; j<=maxC; j++) {
                ans.add(matrix[minR][j]);
            }

            minR++;

            if(minR>maxR || minC>maxC) break;

            for(int i=minR; i<=maxR; i++) {
                ans.add(matrix[i][maxC]);
            }

            maxC--;

            if(minR>maxR || minC>maxC) break;

            for(int j=maxC; j>=minC; j--) {
                ans.add(matrix[maxR][j]);
            }

            maxR--;

            if(minR>maxR || minC>maxC) break;

            for(int i=maxR; i>=minR; i--) {
                ans.add(matrix[i][minC]);
            }

            minC++;
        }

        return ans;
    }
}
