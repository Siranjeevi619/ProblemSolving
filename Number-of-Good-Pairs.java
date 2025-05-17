class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numsSize = nums.length;
        int count = 0;
        for(int i = 0 ; i < numsSize ; i +=1){
            
            for(int j = i ; j < numsSize ; j +=1){
                if(nums[i] == nums[j] && i < j){
                    count +=1;
                }
            }
        }
        return count;
    }
}