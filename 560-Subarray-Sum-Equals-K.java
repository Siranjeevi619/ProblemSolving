class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        // for(it)
        int temp = 0, count = 0;
        for(int i : nums){
            temp +=i;
            if(mpp.containsKey(temp - k)){
                count += mpp.get(temp - k);
            }
            mpp.put(temp, mpp.getOrDefault(temp, 0) + 1);
        }
        return count;
    }
}