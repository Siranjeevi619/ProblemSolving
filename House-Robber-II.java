class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if (n == 1) {
            return nums[0];
        }

        // Create two arrays: one excluding last house, one excluding first house
        int[] arr1 = new int[n - 1]; // from 0 to n-2
        int[] arr2 = new int[n - 1]; // from 1 to n-1

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = nums[i];
        }

        return Math.max(solve(arr1), solve(arr2));
    }

    static int solve(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int pick = nums[i] + dp[i - 2];
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }
}
