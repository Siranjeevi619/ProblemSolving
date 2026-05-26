class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int res = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if (nums.length == k) {
            return (double)sum / k;
        }
        // res = Math.max(res, sum / k);
        int left = 0;
        res = sum;
        // sum = 0;
        for (int right = k; right < nums.length; right += 1) {
            sum -= nums[left];
            sum += nums[right];
            left += 1;

            res = Math.max(res, sum);

        }
        return (double)res/k;
    }
}