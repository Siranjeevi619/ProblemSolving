class Solution {
    static int upperBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
              start = mid + 1; 
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int lowerBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result =  mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int upp = upperBound(nums, target);
        int low = lowerBound(nums, target);
        return new int[] {low,  upp  };

    }
}