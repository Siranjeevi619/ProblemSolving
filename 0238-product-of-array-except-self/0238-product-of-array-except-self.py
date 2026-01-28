class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix= [0] * n
        suffix = [0] * n
        prefix[0] = nums[0]
        suffix[n - 1] = nums[n - 1]
        for i in range(1, n):
            prefix[i] =prefix[i - 1] * nums[i]  
        
        for i in range(n - 2 , -1 , -1):
            suffix[i] = suffix[i+1] * nums[i]
        
        res = [0] * n
        for i in range(n):
            left = prefix[i - 1] if i > 0 else 1
            right = suffix[i + 1] if i < n - 1 else 1
            res[i] = left * right
        return res

