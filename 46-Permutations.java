class Solution {
    static void permutate(List<List<Integer>> result , int index, int [] nums){
        if(index == nums.length){
            // result.add(new ArrayList<>());
            List<Integer> current = new ArrayList<>();
            for(int i : nums){
                current.add(i);
            }
            result.add(current);
            return ;
        }
        for(int i = index; i <nums.length ; i++){
            swap(nums, index, i);
            permutate(result, index+1, nums);
            swap(nums, index, i);
        }
    }

    static void swap(int  [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutate(result, 0, nums);
        return result;
    }
}