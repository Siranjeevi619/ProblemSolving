class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int presum = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            presum += (nums[i] == 0) ? -1 : 1;
            if(presum == 0){
                max = i+1;
            }
            if(mpp.containsKey(presum)){
                max = Math.max(max, i - mpp.get(presum));
            }
            else{
                mpp.put(presum, i);
            }
        }
        return max;
    }
}