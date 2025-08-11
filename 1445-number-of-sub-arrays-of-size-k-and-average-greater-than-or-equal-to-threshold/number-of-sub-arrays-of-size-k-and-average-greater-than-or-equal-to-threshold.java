class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        if (k > n)
            return 0;
        int target = threshold * k;
        int count = 0;

        for (int i = 0; i + k <= n; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum >= target) {
                count++;
            }
        }
        return count;
    }
}
