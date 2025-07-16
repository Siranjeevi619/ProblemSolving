class Solution {
    public int[] leftRightDifference(int[] nums) {
        int numsSize = nums.length;
        int [] leftSum = new int[numsSize];
        int [] rightSum = new int[numsSize];
        leftSum[0] = 0;
        for(int i = 1; i < numsSize; i+=1){
            leftSum[i] += leftSum[i-1] + nums[i-1];
        }
        rightSum[numsSize-1] = 0;
        for(int i = numsSize-2;i >= 0 ; i-=1){
            rightSum[i] += rightSum[i+1] + nums[i+1];
        }
        int [] ans = new int[numsSize];
        for(int i = 0 ; i < nums.length;i+=1){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}