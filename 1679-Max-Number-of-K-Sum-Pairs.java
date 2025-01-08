class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int numsSize = nums.length;
        for(int i = 0 ; i < numsSize ; i+=1){
            int num = k - nums[i];
            if(mpp.getOrDefault(num, 0) > 0){
                count += 1;
                mpp.put(num, mpp.get(num)-1);
            }
            else{
                mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

            }
        }
        return count;
    }
}