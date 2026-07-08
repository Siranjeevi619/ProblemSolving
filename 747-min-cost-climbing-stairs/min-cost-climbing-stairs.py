class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        dp = [0] * (len(cost) + 1)
        size = len(cost)

        # dp[0] = cost[0]
        # dp[1] = cost[1]

        for i in range(2, size+1):
            dp[i] = min((dp[i-2] + cost[i-2]), (dp[i-1] + cost[i-1]))
        return dp[-1]
