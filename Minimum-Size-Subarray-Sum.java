class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int numsSize = nums.length;
        int length  = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < numsSize) {
            sum += nums[end];
            while (sum >= target) {
                length = Math.min(length, end - start + 1);

                sum -= nums[start];
                start += 1;
            }

            end += 1;
        }
        return length == Integer.MAX_VALUE ? 0 : length;

    }
}