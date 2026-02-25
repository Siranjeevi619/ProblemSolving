class Solution {
    static int perform(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int left = 0;
        int count = -1;
        for (int right = 0; right < nums.length; right += 1) {

            mpp.put(nums[right], mpp.getOrDefault(nums[right], 0) + 1);

            while (mpp.size() > k) {
                mpp.put(nums[left], mpp.getOrDefault(nums[left], 0) - 1);

                if (mpp.get(nums[left]) == 0) {
                    mpp.remove(nums[left]);
                }

                left += 1;
            }
        
                count += right - left + 1;
            
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return perform(nums, k) - perform(nums, k - 1);
    }
}