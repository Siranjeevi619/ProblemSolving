class Solution {
    public int longestConsecutive(int[] nums) {
         int n = nums.length;

        if (n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 1;
        int currMax = 0;

        for (int i : set) {
            int curr = i;
            currMax = 1;
            if (!set.contains(curr - 1)) {

                while (set.contains(curr + 1)) {
                    currMax += 1;
                    curr += 1;
                }
            max = Math.max(max, currMax);

            }
        }
        return max;
    }
}