class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        HashSet<Character> hset = new HashSet<Character>();
        for (int idx = 0; idx < s.length(); idx++) {
            char character = s.charAt(idx);
            if (hset.contains(character)) {
                length += 2;
                hset.remove(character);
            }
            else {
                hset.add(character);
            }
        }
        if (hset.size() > 0) {
            length ++;
        }
        return length;      
    }
}