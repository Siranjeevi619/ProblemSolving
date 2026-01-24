class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) -1 
        while left < right:
            mid  = left + (right - left) // 2
            if mid % 2 == 1:
                mid -=1
            if nums[mid] == nums[mid + 1]:
                left +=2 
            else :
                right -=1
        return nums[left]