class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        k_count = 1
        while k >= 0 :
           
            if k_count not in arr:
                k-=1
            if k == 0:
                return k_count 
            k_count +=1
        
        
