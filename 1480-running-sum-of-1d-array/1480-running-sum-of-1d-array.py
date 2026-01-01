class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        counter = 0
        curr_num = 0
        for i in range(len(nums)):
            curr_num = nums[i]
            nums[i] += counter
            counter+= curr_num
        return nums