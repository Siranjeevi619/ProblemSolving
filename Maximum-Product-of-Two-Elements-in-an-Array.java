class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int numsSize = nums.length;
        for(int i = 0 ; i < numsSize ; i+=1){
            for(int j = i+1 ; j < numsSize ; j+=1){
                res = Math.max( ((nums[i]-1) * (nums[j]-1)) , res  );
            }
        }
        return res;
    }
}