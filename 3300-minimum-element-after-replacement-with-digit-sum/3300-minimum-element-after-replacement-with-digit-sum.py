class Solution:
    def minElement(self, nums: List[int]) -> int:
        for i in range(0, len(nums)):
            if nums[i] < 10 :
                continue
            else : 
                nums[i] = self.make_single(nums[i])
                print(nums[i])
        
        mini = float("inf")
        for i in nums:
            mini = min(mini, i)
        return mini
    

    def make_single(self, num):
        sum = 0
        while num > 0 :
            rem = num % 10
            sum += rem
            num //= 10
        return sum