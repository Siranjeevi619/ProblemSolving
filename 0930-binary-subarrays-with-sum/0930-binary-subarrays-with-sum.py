class Solution:
    def perform(self, nums: List[int], goal:int) -> int:
        if goal < 0:
            return 0
        count = 0
        left = 0
        sumi = 0
        for right in range(0,len(nums)):
            sumi += nums[right]
            while(sumi > goal):
                sumi-= nums[left]
                left+=1
            count += (right - left + 1)
        return count

    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
        return self.perform(nums, goal) - self.perform(nums, goal-1)
        