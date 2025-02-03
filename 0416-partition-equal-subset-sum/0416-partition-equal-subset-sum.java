class Solution {
    // static boolean find(int[] nums, int index, int target, int [][] dp){
    //     if(target == 0){
    //         return true;
    //     }
    //     if(index == 0){
    //         return nums[index] == 0;
    //     }
    //     if(dp[index][target] != -1){
    //          return dp[index][target] == 0 ? false : true;
    //     }
    //     boolean notTake = find(nums, index -1 , target,dp );
    //     boolean take = false;
    //     if(target >= nums[index]){
    //         take = find(nums, index - 1 , target - nums[index], dp);
    //     }
    //     dp[index][target] = notTake || take ? 1 : 0;
    //     return notTake || take;
    // }
    // public boolean canPartition(int[] nums) {
    //     int totalSum = 0;
    //     for(int i : nums){
    //         totalSum += i;
    //     }
    //     if(totalSum % 2 ==1){
    //         return false;
    //     }
    //     int target = totalSum / 2;
    //     int [][] dp = new int[nums.length][target + 1];
    //     for(int i = 0; i < nums.length ; i+=1){
    //         for(int j = 0 ; j < target ; j +=1){
    //             dp[i][j] = -1;
    //         }
    //     }
    //     return find(nums,nums.length -1 ,target, dp);
    // }
      static boolean subsetSumUtil(int ind, int target, int arr[], int[][] dp) {
        if (target == 0)
            return true;
        if (ind == 0)
            return arr[0] == target;
        if (dp[ind][target] != -1)
            return dp[ind][target] == 0 ? false : true;
        boolean notTaken = subsetSumUtil(ind - 1, target, arr, dp);
        boolean taken = false;
        if (arr[ind] <= target)
            taken = subsetSumUtil(ind - 1, target - arr[ind], arr, dp);
        dp[ind][target] = notTaken || taken ? 1 : 0;
        return notTaken || taken;
    }
    static boolean canPartition( int[] arr) {
        int totSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totSum += arr[i];
        }
        if (totSum % 2 == 1)
            return false;
        else {
            int k = totSum / 2;
            int dp[][] = new int[n][k + 1];
            for (int row[] : dp)
                Arrays.fill(row, -1);
            return subsetSumUtil(n - 1, k, arr, dp);
        }
    }
}