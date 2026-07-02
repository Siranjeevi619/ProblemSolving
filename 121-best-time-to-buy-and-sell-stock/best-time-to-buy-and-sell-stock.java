class Solution {
    public int maxProfit(int[] prices) {
        int max_profit =  prices[0];
        int max_so_far = 0;
        for(int i = 1 ; i < prices.length ; i+=1){
            // max_profit = Math.max(prices[i], max_profit);
            if(max_profit > prices[i]){
                max_profit = prices[i];
            }
            max_so_far = Math.max(max_so_far, prices[i] -  max_profit);
        }
        return max_so_far;
    }
}