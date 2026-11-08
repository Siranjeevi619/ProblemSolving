class Solution:
    def buildArray(self, nums: list[int]) -> list[int]:
        res = [0] * len(nums)
        for i in range(0, len(nums)):
            res[i] = nums[nums[i]]
        return res