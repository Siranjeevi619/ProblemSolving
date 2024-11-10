class Solution {
    public boolean canJump(int[] nums) {
        int maxLength = 0; 
        int i = 0;          
        while (i <= maxLength) {
            if (i + nums[i] > maxLength) {
                maxLength = i + nums[i];
            }
            if (maxLength >= nums.length - 1) {
                return true;
            }
            i++;
        }
        return false;
    }
}
