class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int maxSoFar = nums[0];
        for(int i = 1 ; i< nums.length; i++){
            // if(i == 0){

            // }
            currentMax = Math.max(currentMax, nums[i] + currentMax);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}