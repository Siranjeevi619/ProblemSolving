class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = Integer.MIN_VALUE;
        int numsSize = nums.length;
         diff = Math.abs(nums[0] - nums[numsSize - 1]);
         for(int i = 0;  i < numsSize-1 ; i+=1){
            diff = Math.max(Math.abs(nums[i] - nums[i+1]), diff);
         }
       
         return diff;
    }
}