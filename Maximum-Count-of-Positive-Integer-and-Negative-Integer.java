class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int i : nums){
            if(i > 0){
                pos+=1;
            }
            if(i < 0){
                neg +=1;
            }
        }
        return Math.max(pos, neg);
    }
}