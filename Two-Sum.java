class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        // for (int i : nums) {
        //     mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        // }
        int numsSize = nums.length;
        for(int  i = 0 ; i < numsSize ; i+=1){
            int x = target- nums[i];
            if(mpp.containsKey(x) && mpp.get(x) != i){
                return new int [] {i, mpp.get(x)};
            } 
            mpp.put(nums[i], i);
        }
        return new int[]{-1,-1};

    }
}