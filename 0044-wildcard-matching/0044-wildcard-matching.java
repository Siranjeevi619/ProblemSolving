class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean [][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int i = 1 ; i <= n ; i+=1){
            if(p.charAt(i-1) =='*'){
                dp[0][i] = dp[0][i-1];
            }
        }
        for(int i = 1 ; i <= m ; i+=1){
            for(int j = 1; j <= n ; j+=1){
                char pc = p.charAt(j-1);
                char sc = s.charAt(i-1);
                if(pc== '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
                else if(pc == '?' || pc == sc){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[m][n];
    }
}