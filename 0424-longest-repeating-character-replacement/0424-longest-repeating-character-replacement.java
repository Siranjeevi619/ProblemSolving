class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int left = 0;
        int  maxLen = 0;
        int maxFreq = 0;
        for(int right = 0; right < s.length() ; right+=1){
            char ch = s.charAt(right);
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
            maxFreq = Math.max(maxFreq, mpp.get(ch));
            while((right - left + 1) - maxFreq > k){
                char chLeft = s.charAt(left);
                mpp.put(chLeft, mpp.getOrDefault(chLeft, 0)-1);
                left+=1;
                
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;

    }
}