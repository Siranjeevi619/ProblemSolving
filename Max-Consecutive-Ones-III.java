class Solution {
    public int longestOnes(int[] nums, int k) {
        int numsSize = nums.length;
        int left = 0, right = 0, len = 0;
        int zeroCount = 0;
        while(right < numsSize){
             if(nums[right] == 0){
                zeroCount+=1;
            }
            while(zeroCount > k){
                if(nums[left] ==0){
                    zeroCount-=1;
                 
                }
                left+=1;
            }
            if(zeroCount <= k){
                len = Math.max(len, right - left+1);
                right+=1;
            }
        }
        return len;
    }
}