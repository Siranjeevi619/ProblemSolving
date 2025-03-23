class Solution {
    public int maxSubArray(int[] a) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
                  if (max_ending_here < 0)
                max_ending_here = 0;
            max_ending_here += a[i];
            max_so_far = Math.max(max_so_far, max_ending_here);
      
        }
        return max_so_far;
        // used kadane algorithm 
    }
}