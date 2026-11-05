class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;
        for(int i : nums){
            set.add(i);
        }
        for(int i : set){
            // int cons = 1;
            if(!set.contains(i-1)){
                    int length = 1;
                while(set.contains(i + length)){
                    length+=1;
                }
                maxCount = Math.max(maxCount, length);
            }
        }
        return maxCount;
    }
}