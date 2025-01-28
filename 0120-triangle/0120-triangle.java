class Solution {
    static int minPath(int i , int j, List<List<Integer>> triangle , int size, int [][] dp){
        if(i == size - 1){
            return triangle.get(size-1).get(j);
        }
        if(dp[i][j] !=  -1){
            return dp[i][j];
        }
        int down = triangle.get(i).get(j) + minPath(i+1, j , triangle, size, dp);
        int downRight = triangle.get(i).get(j) + minPath(i+1, j+1, triangle, size, dp);
        return dp[i][j] = Math.min(down, downRight);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int [][]dp = new int [size][size];
        for(int [] d : dp){
            Arrays.fill(d, -1);
        }
        return minPath(0, 0, triangle, size, dp);
    }
}