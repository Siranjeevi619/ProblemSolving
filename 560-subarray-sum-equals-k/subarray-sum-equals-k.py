class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map = {}
        count = 0
        map[0] = 1
        sum = 0
        for i in nums:
            sum += i 
            if (sum - k) in map:
                count += map[sum-k]
            map[sum] = 1 + map.get(sum, 0)
        return count