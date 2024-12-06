class Solution {
    public int findMin(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int numsSize = nums.length;
        int low = 0;
        int high = numsSize - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[low] <= nums[mid]){
                minimum = Math.min(minimum , nums[low]);
                low = mid +1;
            }
            else{
                minimum = Math.min(minimum , nums[mid]);
                high = mid  - 1;

            }
        }
        return minimum;
    }
}