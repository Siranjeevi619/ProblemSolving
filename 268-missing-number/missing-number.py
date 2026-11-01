class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)
        total = (n * (n + 1)) // 2
        sumi = sum(nums)
        return total - sumi
        