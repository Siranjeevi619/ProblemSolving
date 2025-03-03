class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max = 0;
        while(left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentMax = width * minHeight;
            if(height[left] < height[right]){
                left+=1;
            }
            else{
                right-=1;
            }
            max = Math.max(currentMax , max);
        }
        return max;
    }
}