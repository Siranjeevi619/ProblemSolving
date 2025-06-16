class Solution {
    public int maximumDifference(int[] nums) {
        int numsSize  = nums.length;
        int min = -1;
        for(int i = 0 ; i < numsSize ; i+=1){
            for(int j = i+1 ; j < numsSize ; j+=1){
                if(nums[i] < nums[j]){
                    min = Math.max(min, Math.abs(nums[i] - nums[j]));
                }
            }
        }
        return min;
    }
}