class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long)n * (n - 1) / 2;
        Map<Integer, Integer> diffCounts = new HashMap<>();
        
        long goodPairs = 0;
        
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            goodPairs += diffCounts.getOrDefault(diff, 0);
            diffCounts.put(diff, diffCounts.getOrDefault(diff, 0) + 1);
        }
        
        return (long)(totalPairs - goodPairs);
    }
}