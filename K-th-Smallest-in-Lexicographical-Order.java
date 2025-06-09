class Solution {
    
    static long countStep(int limit, int curr, int next){
        long step = 0;
        while(curr <= limit){
            step += Math.min(limit+1 , next) - curr;
            curr *= 10;
            next *= 10;
        }
        return step;
    }

    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while(k > 0){
            long step = countStep(n, curr, curr + 1);
            if(step <= k){
                curr+=1;
                k-= step;
            }
            else{
                curr *= 10;
                k-=1;
            }
        }
        return curr;

    }
}