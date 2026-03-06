class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for(int i = 0 ; i < heights.length ; i++){
            while(st.peek() != -1 && heights[i] <= heights[st.peek()]){
                int length =  heights[st.pop()];
                int width = i - st.peek() - 1;
                max = Math.max(max, length * width);
            }
            st.push(i);
        }
        while(st.peek() != -1){
                 int length = heights[st.pop()];
                int width = heights.length - st.peek() - 1;
                max = Math.max(max, length * width);
        }
        return max;
    }
}