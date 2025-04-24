class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int totalDistinct = set.size();
        int numsSize = nums.length;
        int counter = 0;
        for(int i = 0; i < numsSize ; i+=1){
                set.clear();
            for(int j = i; j < numsSize ; j++){
                set.add(nums[j]);
                if(set.size() == totalDistinct){
                    counter+=1;
                }
            }
        }
        return counter;
    }
}