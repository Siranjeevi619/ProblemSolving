class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxi = 0;
        int numsSize = nums.length;
        for(int i=0;i<numsSize;i++){
            if(nums[i] == 1){
                count +=1;
            }
            else{
                count = 0;
            }
            maxi =   maxi > count ? maxi : count;
        }
        return maxi;
    }
}