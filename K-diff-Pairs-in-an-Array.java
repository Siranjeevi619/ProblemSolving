class Solution {
    public int findPairs(int[] nums, int k) {
        int numsSize = nums.length;
        int count = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i , mpp.getOrDefault(i, 0)+1);
        }
        for(int i : mpp.keySet()){
            if(k ==0){
                if(mpp.get(i) >1){
                    count+=1;
                }
            }
            else{
                if(mpp.containsKey(i + k)){
                    count+=1;
                }
            }
        }
        return count;
    }
}
