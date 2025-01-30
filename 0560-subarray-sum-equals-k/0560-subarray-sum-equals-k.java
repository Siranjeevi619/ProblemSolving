class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int total = 0 , count = 0;
        for(int i : nums){
            total += i;
            if(mpp.containsKey(total - k)){
                count += mpp.get(total - k);
            }
            mpp.put(total, mpp.getOrDefault(total, 0) + 1);
        }

       return count;
    }
}