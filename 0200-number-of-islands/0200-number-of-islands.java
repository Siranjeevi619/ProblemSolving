class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i+=1){
            for(int j = 0 ; j < grid[0].length ; j+=1){
                if(grid[i][j] == '1'){
                    count+=1;
                    dfs(grid, i , j);
                }
            }
        }
        return count;
    }
    static void dfs(char [][] grid, int i , int j){
        
        if(i < 0 || j < 0 || i > grid.length -1 || j > grid[0].length -1){
            return ;
        }
         if(grid[i][j] == '0'){
        return;   
    }

        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        }
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}