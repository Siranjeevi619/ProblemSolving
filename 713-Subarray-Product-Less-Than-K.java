class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int total) {
        int numsSize = nums.length;
        int mul = 1;
        int count = 0;
        int j = 0;

        for (int i = 0; i < numsSize; i++) {
            mul *= nums[i];

            while (mul >= total && j <= i) {
                mul /= nums[j];
                j++;
            }

            count += i - j + 1;
        }

        return count;
    }
}
