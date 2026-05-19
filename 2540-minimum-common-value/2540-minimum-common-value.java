class Solution {
    static boolean binarySearch(int [] nums, int target){
        int left = 0;
        int right = nums.length ;
        while( left <= right){
            int mid = left + (right  - left ) / 2;
            if(nums[mid] == target){
                return true;
            }
            else if( nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            
        }
        return false;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {

            if (nums1[p1] == nums2[p2]) {
                return nums1[p1];
            }

            else if (nums1[p1] < nums2[p2]) {
                p1++;
            }

            else {
                p2++;
            }
        }

        return -1;
    }
}