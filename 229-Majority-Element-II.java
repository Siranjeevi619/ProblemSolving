class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int numsSize = nums.length;
        for(int i=0;i<numsSize;i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> result = new ArrayList<>();
        int cond = numsSize / 3;

        for(Map.Entry<Integer, Integer> i : countMap.entrySet() ){
            int num = i.getKey();
            int count = i.getValue();

            if(count > cond){
                result.add(num);
            }
        }
        return result;
    }
}