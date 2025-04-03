class Solution {
    public int subarraySum(int[] nums, int k) {
        int numsSize = nums.length;
        int count = 0;
        for(int i = 0 ; i < numsSize ; i+=1){
            int sum   = 0;
            for(int j = i; j < numsSize ; j+=1){
                sum += nums[j];
                if(sum == k){
                count +=1;
            }
            }
           
        }
        return count;
    }
}