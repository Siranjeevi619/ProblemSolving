class Solution {
    public boolean isMonotonic(int[] nums) {
        int numSize = nums.length;
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < numSize; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
                break;
                // return increasing;
            }
        }
        for (int i = 1; i < numSize; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
                // return decreasing;
                break;
            }
        }
        return increasing || decreasing;
    }
}
