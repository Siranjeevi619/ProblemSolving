class Solution {
    public boolean check(int[] nums) {
        int numsSize = nums.length;
        int count = 0;
            for(int i=0;i<numsSize;i++){
                if(nums[i] > nums[(i+1)%numsSize]){
                    count++;
            }
        }
        return count<=1;
    }
}