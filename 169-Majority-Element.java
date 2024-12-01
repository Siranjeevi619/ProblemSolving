class Solution {
    public int majorityElement(int[] nums) {
        int currentIndex = 0;
        int count = 0;
        int numsSize = nums.length;
        for(int i=0;i<numsSize;i++){
            if(count == 0){
                currentIndex = nums[i];
            }
            count+= (currentIndex == nums[i]) ? 1 : -1;
        }
        return currentIndex;
    }
}