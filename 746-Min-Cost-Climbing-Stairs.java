class Solution {
    static int [] dp ;
    static int findCost(int [] cost, int index){
        // if(index == costSize- 1 || index ==  costSize - 2){
        //     return cost[index];
        // }
        // // if(dp[index] != -1){
        // //     return [index];
        // // }
        // int os = findCost(cost, costSize, index + 1);
        // int ts = findCost(cost, costSize, index +  2);
        // return Math.min(os, ts);

        if(index == cost.length - 1 || index == cost.length -2){
            return cost[index];
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int os = findCost(cost, index + 1);
        int ts = findCost(cost, index  + 2);
        dp[index] = cost[index] +Math.min(os , ts);
        return dp[index];
    
    }
    public int minCostClimbingStairs(int[] cost) {
        int costSize = cost.length;
        dp = new int[costSize];
        Arrays.fill(dp, -1);
        // int result = findCost(cost, costSize, 0 );
        // return result;
        return Math.min(findCost(cost, 0) , findCost(cost, 1));
    }
}