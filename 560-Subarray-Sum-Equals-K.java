class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int sum  =0, count = 0;
        int numsSize = nums.length;
                    mpp.put(0,1);

        for(int i = 0 ; i < numsSize ; i +=1){
            sum += nums[i];
            int remains = sum - k ;
            if(mpp.containsKey(remains)){
                count += mpp.get(remains);
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}