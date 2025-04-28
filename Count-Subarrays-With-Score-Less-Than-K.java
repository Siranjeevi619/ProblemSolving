class Solution {
    public long countSubarrays(int[] nums, long k) {
        long counter = 0; 
        int numsSize = nums.length;
        long sum = 0;  
        int left = 0, right = 0;

        while (right < numsSize) {
            sum += nums[right];
            while (left <= right && (sum * (right - left + 1)) >= k) {
                sum -= nums[left];
                left += 1;
            }
            counter += (right - left + 1);
            right += 1;
        }

        return counter;
    }
}
