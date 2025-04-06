class Solution {
    public int characterReplacement(String s, int k) {
        int size = s.length();
        Map<Character, Integer> mpp =new HashMap<>();
        int left = 0, right = 0, maxLength = 0, maxFreq = 0;
        while(right < size){
            mpp.put(s.charAt(right), mpp.getOrDefault(s.charAt(right), 0)+1);
            maxFreq = Math.max(maxFreq, mpp.get(s.charAt(right)));
            while((right - left+1) -maxFreq > k ){
                mpp.put(s.charAt(left), mpp.getOrDefault(s.charAt(left), 0) - 1);
                left+=1;
            }
               maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}