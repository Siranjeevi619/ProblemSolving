class Solution {
    public long subArrayRanges(int[] nums) {
        int numsSize = nums.length;
        long totalSum = 0;
        for(int i = 0 ; i < numsSize;i+=1){
                int max = nums[i];
                int min =nums[i];
            for(int j = i+1; j < numsSize; j+=1  ){
                // for(int k = i ; k <=j;k+=1 ){
                    max = Math.max(nums[j], max);
                    min = Math.min(nums[j], min);
                // }
                totalSum += (max - min);
            }
        }
        return totalSum;
    }
}