class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        int numsSize = nums.length;
        int i = 0;
        List<String> result = new ArrayList<>();
        while(i < numsSize){
            start = nums[i];
            while(i<numsSize-1 && nums[i] + 1 == nums[i+1]){
                i+=1;
            }
            if(start != nums[i]){
                result.add(start+\->\+nums[i]);
            }
            else{
                result.add(\\+nums[i]);
            }
            i+=1;
        }
        return result;
        
    }
}