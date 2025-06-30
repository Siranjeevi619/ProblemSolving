class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int numsSize = nums.length;
        int j = 0;
        int maxLen = 0;
        for(int i = 0 ; i < numsSize ; i+=1){
            while(nums[i] - nums[j] > 1){
                j++;
            }

            if(nums[i] - nums[j] == 1){
                maxLen = Math.max(maxLen, i - j +1);
            }

        }
        return maxLen;

    }
}