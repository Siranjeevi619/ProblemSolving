class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int numsSize  = nums.length;
        for(int i = 0 ; i  < numsSize - 2  ; i+=1){
            if(nums[i] == 0){
                count +=1;
                nums[i] = 1;
                nums[i+1] = nums[i+1] == 0 ? 1 : 0;
                nums[i+2] = nums[i+2] == 0 ? 1 : 0;
            }
        }
        return (nums[numsSize-2] == 1 && nums[numsSize-1] == 1) ? count : -1;
    }
}