class Solution {
    static boolean dfs(int [] nums, boolean [] visited, int start, int k , int currSum, int target){
        if(k == 0){
            return true;
        }
        if(currSum > target){
            return false;
        }
        if(currSum == target){
            return dfs(nums, visited, 0, k - 1, 0, target);
        }

        for(int i = start ; i < nums.length ; i+=1){
            if(visited[i]) continue;
            visited[i] = true;
            if(dfs(nums, visited, i + 1 , k , currSum  + nums[i], target)) return true;
            visited[i] = false;
        }
        return false;


    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if( sum % k != 0 || nums.length < k){
            return false;
        }
        // Arrays.sort(nums);
        // reverse
        int target = sum / k;
        boolean [] visited = new boolean[nums.length];
        return dfs(nums,visited, 0,  k, 0,target  );

        
    }
}