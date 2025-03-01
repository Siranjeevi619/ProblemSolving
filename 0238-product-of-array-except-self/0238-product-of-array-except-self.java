class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsSize = nums.length;
        int [] output = new int[numsSize];
        for(int i = 0 ; i < numsSize ; i+=1){
            output[i] = 1;
        }
        int left = 1;
        for(int i = 0 ; i < numsSize ; i+=1){
            output[i] *= left;
            left *= nums[i];
        }
        int right = 1;
        for(int i = numsSize - 1; i >= 0; i-=1){
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
}