class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> result = new HashSet<>();
      int numsSize = nums.length;
      for(int i=0;i<numsSize;i++){
        if(result.contains(nums[i])){
            return true;
        }
        result.add(nums[i]);
      }
      return false;
    }
}