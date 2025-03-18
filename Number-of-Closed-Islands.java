class Solution {
    static boolean dfs(int [][] grid, int row, int col){
           int rowSize = grid.length;
        int colSize = grid[0].length;
        if(row < 0 || col < 0 || rowSize <=  row || colSize <= col){
            return false;
        }
        if(grid[row][col] == 1){
            return true;
        }
        grid[row][col] = 1;
        boolean top = dfs(grid, row-1, col);
        boolean bottom = dfs(grid, row+1, col);
        boolean right= dfs(grid, row, col+1);
        boolean left = dfs(grid, row, col-1);
        return top && bottom && left && right;
    }
    public int closedIsland(int[][] grid) {
        int islandCount = 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;
        boolean [][] visited = new boolean[rowSize][colSize];
        for(int i = 0 ; i < rowSize ; i +=1){
            for(int j = 0 ; j < colSize ; j+=1){
                if(grid[i][j] == 0 && dfs(grid, i , j)){
                    islandCount+=1;
                }
            }
        }
        return islandCount;
    }
}