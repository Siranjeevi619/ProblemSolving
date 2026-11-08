class Solution:
    def findNumbers(self, nums: list[int]) -> int:
        count = 0
        for i in nums:
            s = str(i)
            if len(s) % 2 == 0:
                count+=1
        return count