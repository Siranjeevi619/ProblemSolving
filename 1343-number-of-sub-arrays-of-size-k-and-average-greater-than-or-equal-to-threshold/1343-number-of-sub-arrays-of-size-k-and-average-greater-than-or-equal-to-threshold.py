class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        sum  = 0 
        for i in range(0, k):
            sum += arr[i]
        sub_count = 0
        if int(sum / k) >= threshold:
            print(int(sum / k))
            sub_count +=1

        left = 0
        for right in range(k, len(arr)):
            sum -= arr[left]
            sum += arr[right]

            if int(sum/k) >= threshold :
                print(int(sum / k))
                sub_count +=1
            left +=1

        return (sub_count)