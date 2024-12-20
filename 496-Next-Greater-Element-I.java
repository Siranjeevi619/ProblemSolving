class Solution {
    static int findIndex(int[] nums, int target) {
        int numsSize = nums.length;
        if (nums[numsSize - 1] == target) {
            return numsSize - 1;
        }
        for (int i = 0; i < numsSize - 1; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int nge(int[] nums, int startIndex, int currentElement) {
        int numsSize = nums.length;
        for (int i = startIndex; i < numsSize; i++) {
            if (currentElement < nums[i]) {
                return nums[i]; 
            }
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int num1Size = nums1.length;
        int num2Size = nums2.length;
        int[] result = new int[num1Size];

        for (int i = 0; i < num1Size; i++) {
            int currentI = nums1[i];
            int index = findIndex(nums2, currentI);
            if (index != -1) {
                int nextGreater = nge(nums2, index + 1, nums2[index]); 
                result[i] = nextGreater; 
            } else {
                result[i] = -1; 
            }
        }
        return result;
    }
}
