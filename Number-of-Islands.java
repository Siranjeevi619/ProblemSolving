class Solution {
    static void dfs(char [][] grid, int row, int col){
        int rowSize = grid.length;
        int colSize = grid[0].length;
        if( row < 0 || col < 0 || row >= rowSize || col >=colSize || grid[row][col] == '0'){
            return ;
        }
        grid[row][col] = '0';
        dfs(grid, row+1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }
    public int numIslands(char[][] grid) {
       int result = 0;
       int rowSize = grid.length;
       int colSize = grid[0].length;
       for(int i = 0;i<rowSize ; i++){
        for(int j = 0 ; j<colSize ; j++){
            if(grid[i][j] == '1'){
                result +=1 ;
                dfs(grid, i, j);
            }
        }
       } 
       return result;
    }
}