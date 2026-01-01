class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minCurr = Integer.MAX_VALUE;
        for(int i  = 0 ; i < prices.length;i++){
            minCurr = Math.min(minCurr, prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] -  minCurr );
        }
        return maxProfit;
    }
}