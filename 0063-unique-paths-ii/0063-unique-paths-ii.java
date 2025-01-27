class Solution {
    static int findPath(int [][]path, int i , int j,  int [][]dp ){
         if(i < 0 || j < 0){
            return 0;
        }
         if(  path[i][j] ==1){
            return 0;
        }
          if(i==0 && j==0){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
       
        int  up = findPath(path, i-1, j, dp);
        int left = findPath(path, i, j-1, dp);
        // dp[i][j] ;
        return dp[i][j]=  up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][]dp = new int[n+1][m+1];
        for(int [] arr : dp){
            Arrays.fill(arr, -1);
        }
        return findPath(obstacleGrid, n -1, m - 1, dp);
    }
}