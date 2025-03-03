class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i : nums){
            set.add(i);
        }
        int ml = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int cl = 1;
                int cn = i;
                while(set.contains(cn+1)){
                    cl+=1;
                    cn+=1;
                }
                ml = Math.max(ml, cl);
            }
        }
        return ml;
    }
}