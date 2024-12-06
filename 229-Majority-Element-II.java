class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer, Integer> countMap = new HashMap<>();
        // int numsSize = nums.length;
        // for(int i=0;i<numsSize;i++){
        //     countMap.put(nums[i], countMap.getOrDefault(nums[i], 0)+1);
        // }

        // List<Integer> result = new ArrayList<>();
        // int cond = numsSize / 3;

        // for(Map.Entry<Integer, Integer> i : countMap.entrySet() ){
        //     int num = i.getKey();
        //     int count = i.getValue();

        //     if(count > cond){
        //         result.add(num);
        //     }
        // }
        // return result;

     int numsSize = nums.length;
    Map<Integer, Integer> freq = new HashMap<>();

    // Count frequencies of elements in nums
    for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        if (entry.getValue() > numsSize / 3) {
            result.add(entry.getKey());
        }
    }

    return result;

    }
}