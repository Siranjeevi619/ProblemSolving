class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        n = len(nums)
        total_sum = sum(nums)

        maxi = 0

        for i, num in enumerate(nums):
            maxi += i * num
        res = maxi

        for i in range(n -1 , 0 , -1):
            maxi = maxi +  total_sum - n * nums[i]
            res = max(res, maxi)
        return res 

            