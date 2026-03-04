class Solution {
    static boolean isValid(int k, int [] piles,int h){
        long count = 0;
        for(int i : piles){
            count += i / k;
            if(i % k != 0){
                count+=1;
            }
        }
        return count <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i : piles){
            max = Math.max(i, max);
        }
        
        int left = 1 ;
        int right = max ;
        int ans = -1;
        while(left <= right){
            int mid= left + (right - left) /2;
            if(isValid(mid, piles, h)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}