class Solution {
    static void swap(int [] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == target) res.add(i);
        }
        return res;
    }
}