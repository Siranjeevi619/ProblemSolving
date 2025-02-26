class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int numsSize = nums.length;
        int max = 0, min = 0;
        for (int i = 0; i < numsSize; i += 1) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(sum, max);
        }
        sum = 0;
        for (int i = 0; i < numsSize; i += 1) {
            if (sum > 0) {
                sum = 0;
            }
            sum += nums[i];
            min = Math.min(min, sum);
        }
        return Math.max(max, Math.abs(min));
    }
}