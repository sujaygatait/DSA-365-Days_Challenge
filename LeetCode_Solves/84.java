class Solution {
    public static void nextSmallerRight(int[] arr, int[] nextSmallerRight){
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nextSmallerRight[i] = arr.length;
            else{
                nextSmallerRight[i] = st.peek();
            }
            st.push(i);
        }
    }
    public static void nextSmallerLeft(int[] arr, int[] nextSmallerLeft){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nextSmallerLeft[i] = -1;
            else{
                nextSmallerLeft[i] = st.peek();
            }
            st.push(i);
        }
    }

    public int largestRectangleArea(int[] heights) {
        int[] nextSmallerRight = new int[heights.length];
        int[] nextSmallerLeft = new int[heights.length];

        nextSmallerRight(heights, nextSmallerRight);
        nextSmallerLeft(heights, nextSmallerLeft);

        int maxArea = 0;
        for(int i=0; i<heights.length; i++){
            int area = heights[i] * (nextSmallerRight[i]-nextSmallerLeft[i]-1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
