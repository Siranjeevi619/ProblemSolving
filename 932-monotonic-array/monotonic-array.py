class Solution:
    def isMonotonic(self, nums: list[int]) -> bool:
        updown = True 
        downup = True
        for i in range(0, len(nums) - 1):
            if nums[i] > nums[i+1]:
                downup = False
            if nums[i] < nums[i+1]:
                updown = False
        return not(not updown and not downup)