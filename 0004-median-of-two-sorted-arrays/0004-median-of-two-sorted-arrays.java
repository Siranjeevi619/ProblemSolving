class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sort = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int resIndex = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sort[resIndex] = nums1[i];
                i += 1;
            } else {
                sort[resIndex] = nums2[j];
                j += 1;
            }
            resIndex += 1;
        }
        if (i < nums1.length) {
            for (int start = i; start < nums1.length; start++) {
                sort[resIndex++] = nums1[start];
            }
        }
        if (j < nums2.length) {
            for (int start = j; start < nums2.length; start += 1) {
                sort[resIndex++] = nums2[start];
            }
        }
        for (int s : sort) {
            System.out.print(s + " ");
        }
        int median = sort.length / 2;

        if (sort.length % 2 == 0) {
            return ((double) sort[median] + sort[median - 1]) / 2;
        }
        return sort[median];
    }
}