class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans = 0;
        int numsSize = nums.length;
        int bits = 0;
        int left = 0;
        for(int i = 0 ; i < numsSize ; i+=1){
            while((bits & nums[i])!= 0){
                bits ^= nums[left];
                left+=1;
            }
            bits |= nums[i];
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}