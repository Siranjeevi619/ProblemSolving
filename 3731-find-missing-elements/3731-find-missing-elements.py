class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        res = []
        mini = min(nums)
        maxi = max(nums)
        for i in range(mini, maxi+1):
            if i not in nums:
                res.append(i)
        return res