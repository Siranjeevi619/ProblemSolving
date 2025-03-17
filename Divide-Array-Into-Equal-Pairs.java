class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i< nums.length;i+=1){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }
        for(int i : nums){
            if(mpp.get(i) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}