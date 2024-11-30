class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
            return 0;
        }
        int arrlength = nums.length;
        if (target > nums[arrlength - 1]) {
            return arrlength;
        }
        for (int i = 0; i < arrlength - 1; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target && nums[i + 1] >= target) {
                return i + 1;
            }
        }
        return -1;
    }
}
