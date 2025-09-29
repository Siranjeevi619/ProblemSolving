
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> mpp  = new HashMap<>();
       for(int  i = 0 ; i < nums.length ; i+=1){
        int comp = target - nums[i];
            if(mpp.containsKey(comp)){
                return new int [] {i, mpp.get(comp)};
            }
            mpp.put(nums[i], i);
       }
       return new int [] {-1,-1};
    }
}