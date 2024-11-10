class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        int numsSize = nums.length;
        for(int i=0;i<numsSize;i++){
          for(int j=i+1;j<numsSize;j++){
            if(nums[i] + nums[j] == target){
                    result[0] = i;
                result[1] = j;
                break;
            }
          }
        }
        return result;
    }
}