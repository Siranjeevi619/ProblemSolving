class Solution
{
    int help(int[][]path,int n,int m,int dp[][])
    {
        if(n<0 || m<0)
        {
            return 0;
        }
        if(path[n][m]==1)
        {
            return 0;
        }
        if(n==0 && m==0)
        {
            return 1;
            //basecase
        }
        if(dp[n][m]!=-1)return dp[n][m];
       
     
        int up=help(path,n-1,m,dp);
        int left=help(path,n,m-1,dp);
        return dp[n][m]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] path) 
    {
        int n=path.length;
        int m=path[0].length;
        int dp[][]=new int[n+1][m+1];
        for(int []arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        return help(path,n-1,m-1,dp);        
    }
}