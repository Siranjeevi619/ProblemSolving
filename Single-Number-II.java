class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> m : mpp.entrySet()){
            if(m.getValue() == 1){
                return m.getKey();
            }
        }
        return -1;
    }
}