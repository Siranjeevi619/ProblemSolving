class Solution {
    static int dfs(int [][] grid, int row, int col , boolean [][] visited){
        int rowSize =grid.length;
        int colSize = grid[0].length;
        if(row >= rowSize || col >= colSize || row < 0 || col < 0 || visited[row][col]  || grid[row][col] == 0){
            return 0;
        }
        visited[row][col] = true;
        int count = 1;
        count += dfs(grid, row + 1, col, visited);
        count += dfs(grid, row - 1, col, visited);
        count += dfs(grid, row, col + 1, visited);
        count += dfs(grid, row, col - 1, visited);
        return count;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        int maxCount = 0;
        boolean [][] visited = new boolean[rowSize][colSize];
        for(int i = 0 ; i < rowSize ; i+=1){
            for(int j = 0 ; j < colSize ; j+=1){
                if(grid[i][j]== 1 && visited[i][j] == false){
                    maxCount = Math.max(maxCount, dfs(grid, i, j, visited));
                }
            }
        }
        return maxCount;
    }
}