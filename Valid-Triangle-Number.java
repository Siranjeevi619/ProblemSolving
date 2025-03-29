class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        int numsSize = nums.length;
        Arrays.sort(nums);
        for(int i =  2; i < numsSize ; i+=1){
            int left = 0 , right = i -1;
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    count += right - left;
                    right -=1;
                }
                else{
                    left +=1;
                }
            }
        }
        return count;
    }
}