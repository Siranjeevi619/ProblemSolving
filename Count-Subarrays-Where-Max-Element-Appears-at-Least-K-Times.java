class Solution {
    public long countSubarrays(int[] nums, int k) {
        long counter = 0;
        int numsSize = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(i, max);
        }

        int left = 0, right = 0;
        long subCount = 0;
        for (right = 0; right < numsSize; right++) {
            if (nums[right] == max) {
                subCount += 1;
            }
            while (k <= subCount) {
                if (nums[left] == max) {
                    subCount -= 1;

                }
                left += 1;
            }

            counter += left;
        }
        return counter;
    }
}