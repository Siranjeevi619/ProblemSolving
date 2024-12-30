class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int [2];
        int arrSize = nums.length;
        for(int  i = 0 ; i < arrSize ; i++ ){
            for(int  j = i+1 ; j < arrSize ; j +=1){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}