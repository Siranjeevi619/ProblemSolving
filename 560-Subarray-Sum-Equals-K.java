class Solution {
    public int subarraySum(int[] nums, int k) {
        int numsSize = nums.length;
        int currentMax = 0;
        int max = 0;
        int count  =0 ;
        for(int i=0;i<numsSize;i++){
            int sum = 0;
            for(int j=i;j<numsSize;j++){
                sum += nums[j];
                // count
                 if(sum == k){
                count +=1;
            }
            }
           
        }
        return count;
    }
}