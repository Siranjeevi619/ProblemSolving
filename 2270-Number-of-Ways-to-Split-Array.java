class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long rsum = 0;
        long lsum = 0;
        for (int i : nums) {
            rsum += i;
        }
        int ways = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            lsum += nums[i];
            rsum -= nums[i];
            if (lsum >= rsum) {
                ways += 1;
            }
        }
        return ways;
    }
}