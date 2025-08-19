class Solution {
    public long zeroFilledSubarray(int[] nums) {
         long ans = 0L;
    long cntZ = 0L; // current consecutive zeros
    for (int x : nums) {
        if (x == 0) {
            cntZ++;        // extend run
            ans += cntZ;   // all subarrays ending here
        } else {
            cntZ = 0;      // reset on non-zero
        }
    }
    return ans;
    }
}