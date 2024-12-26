class Solution {
    static void swap(int [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void findPermutate(List<List<Integer>> result, int index, int [] nums){
        if(index == nums.length){
            List<Integer> possibles = new ArrayList<>();
           for(int i : nums){
             possibles.add(i);
           }
            result.add(possibles);
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);
            findPermutate(result, index + 1, nums);
            swap(nums, i, index);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutate(result, 0, nums);
        return result;
    }
}