class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int numsSize = nums.length;
        int [][] diff = new int[numsSize/3][3];
        Arrays.sort(nums);
        int i = 0;
        for(int  j = 0 ; j < numsSize / 3 ; j+=1 ){
            for(int l = 0; l < 3 ; l+=1){
                diff[j][l] = nums[i];
                i+=1;
            }
            if(diff[j][1] - diff[j][0] > k || diff[j][2] - diff[j][0] > k ){
                return new int[0][0];
            }
        }
        return diff;
    }
}