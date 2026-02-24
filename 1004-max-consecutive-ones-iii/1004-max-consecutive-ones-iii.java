class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int left = 0;
        int zeroCount = 0;
        for (int right = 0; right < nums.length; right += 1) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while ( zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount -=1;
                }
                left += 1;
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
    }
}