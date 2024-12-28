class Solution {
    static String reverse(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start += 1;
            end -= 1;
        }
        return new String(s);
    }

    public int longestPalindromeSubseq(String s) {
        String rev = reverse(s.toCharArray());
        int size = s.length();
        int [][] dp = new int[size][size];
        for(int i = 0 ; i < size ; i ++){
            Arrays.fill(dp[i], -1);
        }
        return lps(s, rev, size - 1, size - 1, dp);
    }

    static int lps(String s, String t, int i, int j, int [][]dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = 1 + lps(s, t, i - 1, j - 1 ,dp);
        }
        return dp[i][j] =  Math.max(lps(s, t, i - 1, j,dp), lps(s, t, i, j - 1,dp));

    }
}