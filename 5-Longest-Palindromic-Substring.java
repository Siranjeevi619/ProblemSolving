class Solution {
    public static Boolean validation(String s, int low, int high) {
        while (low <= high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength <= 1) {
            return s;
        }
        int maxLength = 1, start = 0;
        for (int i = 0; i < strLength; i++) {
            for (int j = i; j < strLength; j++) {
                if ((j - i + 1) > maxLength && validation(s, i, j)) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return s.substring(start, start + maxLength);
    }

}
