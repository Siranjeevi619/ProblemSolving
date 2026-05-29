class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        return self.helper(nums, 0, 0)

    def helper(self, nums, index, curr_xor):
        if index == len(nums):
            return curr_xor

        with_element = self.helper(nums, index + 1, curr_xor ^ nums[index])
        without_element = self.helper(nums, index + 1, curr_xor)

        return with_element + without_element