
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsSize1 = nums1.length;
        int numsSize2 = nums2.length;
        int totalSize = numsSize1 + numsSize2;
        int[] resultArray = new int[totalSize];
        
        for (int i = 0; i < numsSize1; i++) {
            resultArray[i] = nums1[i];
        }
        for (int i = 0; i < numsSize2; i++) {
            resultArray[i + numsSize1] = nums2[i];
        }
        
        Arrays.sort(resultArray);
        
        double result;
        int mid = totalSize / 2;
        if (totalSize % 2 != 0) { 
            result = (double) resultArray[mid];
        } else { 
            result = ((double) resultArray[mid - 1] + (double) resultArray[mid]) / 2;
        }

        return result;
    }
}
