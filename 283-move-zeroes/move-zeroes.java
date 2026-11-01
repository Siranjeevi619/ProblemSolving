class Solution {
    static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i += 1) {
            if(nums[i] == 0){
                j = i;
                while(j < nums.length -1 && nums[j] == 0){
                    j++;
                }
                swap(nums, i , j);
            }

        }
    }
}