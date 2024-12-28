class Solution {
    static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int numsSize = nums.length;
        int index = -1;

        for (int i = numsSize - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverseArray(nums, 0, numsSize - 1);
            return;
        }

        for (int i = numsSize - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        reverseArray(nums, index + 1, numsSize - 1);
    }
}
