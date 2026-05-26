class Solution:
    def findLHS(self, nums: List[int]) -> int:
        mpp = {}
        for i in nums :
            mpp[i] =  mpp.get(i, 0)+1
        res = 0
        for key in mpp.keys():
            if key + 1 in mpp:
                res = max(res, mpp.get(key) + mpp.get(key + 1))
        return res