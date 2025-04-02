class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int numsSize = nums.length;
        int count = 0; 
        for(int i = 0 ; i < numsSize ; i +=1){
            int currSum = 0;
            for(int j = i; j < numsSize ; j+=1){
                currSum += nums[j];
                 if(currSum == goal){
                count+=1;
            }
            }
           
        }
        return count;
    }
}