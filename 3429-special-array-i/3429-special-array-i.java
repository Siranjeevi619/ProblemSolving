class Solution {
    public boolean isArraySpecial(int[] nums) {
        int numsSize = nums.length;
        if(numsSize == 1){
            return true;
        }
        for(int i = 0 ; i < numsSize -1 ; i+=1){
          if(nums[i] % 2 == nums[i+1] % 2){
            return false;
          }
        }
        return true;
    }
}