class Solution {
    public int findClosestNumber(int[] nums) {
        int numsSize = nums.length;
        int maxReach = Integer.MAX_VALUE;
        for(int i = 0 ; i < numsSize ; i+=1){
            // maxReach = Math.min(maxReach, Math.abs(nums[i]));
            if(Math.abs(maxReach) > Math.abs(nums[i]) || nums[i] == Math.abs(maxReach)){
                maxReach = nums[i];
            }
        }
        return maxReach;
    }
}