class Solution {
    static int findPaths(int i , int j, int [][] dp ){
      
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int left = findPaths(i - 1, j, dp);
        int right = findPaths(i, j-1, dp);
        dp[i][j]=left+ right;
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m][n];
        for(int i = 0 ; i < m ; i +=1){
            for(int j = 0 ; j < n ; j +=1){
                dp[i][j] = -1;
            }
        }
        return findPaths(m-1, n-1, dp);
    }
}