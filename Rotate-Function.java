class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int F =0;
        int total=0;

        for(int i=0;i<n;i++){
            total += nums[i];
            F += i * nums[i];
        }
        int max = F;

        for(int k=1;k<n;k++){
            F = F + total - (n * nums[n-k]);
            max = Math.max(max,F);
        }

    return max;
    }
}