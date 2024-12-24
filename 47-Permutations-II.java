class Solution {
    static void permutate(Set<List<Integer>> result, int index, int [] nums){
        if(index == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int i : nums){
                permutation.add(i);
            }
            result.add(permutation);
            return ;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
        permutate(result, index + 1 ,nums);
            swap(nums, index, i);
        }
    }
    static void swap(int [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        // List<Integer> result =
        Set<List<Integer>> result = new HashSet<>();
        permutate(result, 0, nums);
        List<List<Integer>> list = new ArrayList<>(result);
        return list;
    }
}