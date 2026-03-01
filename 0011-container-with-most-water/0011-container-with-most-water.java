class Solution {
    public int maxArea(int[] height) {
          int left = 0;
          int right = height.length - 1;
          int max = 0;
          while(left < right){
            int width = right - left;
            int length = Math.min(height[left], height[right]);
            int currHeight = width * length;
            max = Math.max(max, currHeight);
            if(height[left] > height[right]){
                right-=1;
            }
            else{
                left+=1;
            }

          }
          return max;
    }
}