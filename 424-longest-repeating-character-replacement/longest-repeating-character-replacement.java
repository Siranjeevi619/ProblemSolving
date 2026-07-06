class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        int maxLength = 0;
        int result = 0;
        for (int right = 0; right < s.length(); right += 1) {
            mpp.put(s.charAt(right), mpp.getOrDefault(s.charAt(right), 0) + 1);
            maxLength = Math.max(maxLength, mpp.get(s.charAt(right)));
            while ( right - left + 1 - maxLength > k) {
                mpp.put(s.charAt(left), mpp.getOrDefault(s.charAt(left), 0) - 1);
                left += 1;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}