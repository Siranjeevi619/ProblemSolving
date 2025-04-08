class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left  =0 , right = 0, size = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxCount = 0;
        while(right < size){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left+=1;
            }
            set.add(s.charAt(right));
            maxCount  = Math.max(right - left+1, maxCount);
            right+=1;
        }
        return maxCount;
    }
}