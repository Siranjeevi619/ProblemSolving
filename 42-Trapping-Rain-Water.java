class Solution {
    public int trap(int[] height) {
        int heightSize = height.length;
        int [] preffix = new int[heightSize];
        int [] suffix = new int[heightSize];
        preffix[0] = height[0];
        suffix[heightSize -1] = height[heightSize - 1];
        for(int  i = 1 ; i < heightSize ; i++){
            preffix[i] = Math.max(preffix[i-1], height[i]);
        }
        for(int  i = heightSize -2 ; i >=0  ; i-=1){
            suffix[i] = Math.max(suffix[i+1], height[i]);
        }

        int totalCount = 0;
        for(int i = 0 ; i < heightSize ; i++){
            totalCount += Math.min(preffix[i], suffix[i]) - height[i];
        }
        return totalCount;
    }
}