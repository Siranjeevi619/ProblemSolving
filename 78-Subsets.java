class Solution {
    static void findSubSet(List<List<Integer>> result, int index, int numsSize , int [] nums, List <Integer> ds ){
        if(index  == numsSize){
            result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        findSubSet(result, index+1 , numsSize, nums, ds );
        ds.remove(ds.size() - 1);
        findSubSet(result, index+1 , numsSize, nums, ds );
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int numsSize = nums.length;
        findSubSet(result, 0, numsSize , nums, new ArrayList<>());
        return result;
    }
}