class Solution {
    static boolean check(String s, int left, int right) {
        int count = 0;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int count = 0;
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return check(s, left+1, right) || check(s, left, right-1);
            }
            left += 1;
            right -= 1;
        }
        return true;

    }
}