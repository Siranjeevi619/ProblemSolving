class Solution:
    def sortedSquares(self, arr: List[int]) -> List[int]:
        
        for i in range(len(arr)):
            arr[i] = arr[i]**2
        arr.sort()
        return arr