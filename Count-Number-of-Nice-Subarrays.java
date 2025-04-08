class Solution {
    public int atMostKOdds(int[] nums, int k) {
        int left = 0, right = 0, count = 0;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right] % 2;  

            while (sum > k) {
                sum -= nums[left] % 2;
                left++;
            }

            count += (right - left + 1);
            right++;
        }

        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atMostKOdds(nums, k) - atMostKOdds(nums, k - 1);
    }
}
