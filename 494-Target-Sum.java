class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int numsSize = nums.length;
        return help(nums, numsSize -1, target, 0);
    }
    static int help(int [] nums, int numsSize, int target, int sum){
        if(numsSize < 0){
            return target == sum ? 1 : 0;
        }
        int a = help(nums, numsSize -1, target, sum + nums[numsSize]);
        int b = help(nums, numsSize -1 , target, sum - nums[numsSize]);
        return a + b;
    }
}