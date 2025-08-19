class Solution {
    static void swap(int [] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        int n = nums.length;

        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }
}
