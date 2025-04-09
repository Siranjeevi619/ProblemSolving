class Solution {
    public int minOperations(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i : nums)
            if (i < k) return -1;
            else if (i > k) mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        return mpp.size();
    }
}