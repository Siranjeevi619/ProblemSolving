class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = 10000000;
        int result = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long count = 0;
            for(int i : candies){
                count += i / mid;
            }
            if(count >= k){
                result = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
}