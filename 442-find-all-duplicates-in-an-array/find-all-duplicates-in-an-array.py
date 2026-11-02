class Solution:
    def findDuplicates(self, nums: list[int]) -> list[int]:
        map = {}
        for i in nums:
            if i not in map:
                map[i] = 1
            else:
                map[i] = map.get(i) + 1
        res = []
        
        for key, value in map.items():
            if value >=2:
                res.append(key)
        return res