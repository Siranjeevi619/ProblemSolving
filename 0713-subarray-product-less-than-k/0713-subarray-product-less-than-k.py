class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        count = 0
        left = 0
        curr_prod = 1
        if k <= 1:
            return 0
        res_prod = 0
        for right in range(0, len(nums)):
            if nums[right] == 0:
                curr = 1 
            else :
                curr = nums[right]

            curr_prod *= curr

            while  curr_prod >= k:

                num_in_left = nums[left]

                if num_in_left == 0:
                    num_in_left = 1

                curr_prod /= num_in_left

                left+=1

            res_prod +=  right - left + 1

        return res_prod