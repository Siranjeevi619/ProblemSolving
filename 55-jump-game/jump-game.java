class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int i = 0;
        while(i < nums.length){
            max = Math.max(max, i + nums[i]);
            if(max >= nums.length - 1){
                return true;
            }
            if(i == max){
                return false;
            }
            i+=1;
        }
        return true;
    }
}