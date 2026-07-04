class Solution {
    public int maxArea(int[] height) {
        int max = (int) -1e9;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int width = right - left;
            int currHeight = Math.min(height[left], height[right]);
            max = Math.max(max, currHeight * width);
            if(height[left] < height[right]){
                left+=1;
            }
            else{
                right -=1;
            }
        }
        return max;
    }
}