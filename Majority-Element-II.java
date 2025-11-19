class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }
        List<Integer> res =new ArrayList<>();
        int rem = nums.length / 3;
        for(int i : nums){
            if(mpp.get(i) > rem && !res.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}