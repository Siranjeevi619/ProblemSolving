
class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canRob(nums, k, mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }

        return left;
    }
    private boolean canRob(int[] nums, int k, int mid) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= mid) {
                count++;
                i++; 
            }
            i++; 
        }
        return count >= k;
    }
}
