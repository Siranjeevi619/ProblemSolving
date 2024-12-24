class Solution {
    public int climbStairs(int n) {
        int [] jumps = new int[n+1];
        jumps[0] = 1;
        jumps[1] = 1;
        for(int i=2;i<=n;i++){
            jumps[i] = jumps[i-1] + jumps[i-2];
        }
        return jumps[n];
    }
}