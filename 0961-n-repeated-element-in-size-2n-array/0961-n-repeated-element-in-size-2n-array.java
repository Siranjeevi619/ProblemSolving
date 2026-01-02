class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int nSize = nums.length / 2;
        for(int i : nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> m : mpp.entrySet()){
            if(m.getValue() == nSize){
                return m.getKey();
            }
        }
        return 0;
        
    }
}