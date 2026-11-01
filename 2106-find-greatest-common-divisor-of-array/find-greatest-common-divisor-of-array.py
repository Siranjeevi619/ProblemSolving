class Solution:
    def findGCD(self, nums: list[int]) -> int:
        maxi = max(nums)
        mini = min(nums)
        while maxi != mini:
            if mini < maxi :
                maxi = maxi- mini
            else :
                mini = mini - maxi

        return mini