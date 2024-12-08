class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1 += nums2
        nums1.sort()
        median = len(nums1)//2
        if len(nums1) % 2 != 0:
            return nums1[median]
        else:
            return (nums1[median-1]+ nums1[median])/2