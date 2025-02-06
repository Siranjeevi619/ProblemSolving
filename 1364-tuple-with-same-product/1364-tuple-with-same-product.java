class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int numsSize = nums.length;
        int count = 0;
        for(int i = 0 ; i < numsSize ; i+=1){
            for(int j = i+1; j < numsSize ; j+=1){
                int val = nums[i]*nums[j];
                count += 8*mpp.getOrDefault(val, 0);
                mpp.put(val, mpp.getOrDefault(val, 0)+1 );
            }
        }
        return count;
    }
}