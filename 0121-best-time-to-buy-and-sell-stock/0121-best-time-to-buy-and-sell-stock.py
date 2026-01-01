class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_curr = float('inf')
        max_profit = 0
        for i in range(len(prices)):
            min_curr = min(prices[i], min_curr)
            max_profit = max(max_profit, prices[i] - min_curr)
        return max_profit