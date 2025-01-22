//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    static void dfs(char [][] grid, int row, int col){
        int rowSize = grid.length;
        int colSize = grid[0].length;
        if(row < 0 || col < 0 || row >= rowSize ||  col >= colSize  || grid[row][col] == '0' ){
            return ;
        }
        grid[row][col] = '0';
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
        dfs(grid, row+1, col+1);
        dfs(grid, row-1, col -1);
        dfs(grid, row-1, col+1);
        dfs(grid, row +1, col -1);
    }
    
    public int numIslands(char[][] grid) {
        // Code here
        int result = 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;
        for(int i = 0 ; i < rowSize ; i +=1){
            for(int j = 0 ; j < colSize ; j +=1){
                if(grid[i][j] == '1'){
                    result +=1;
                    dfs(grid, i, j);
                }
            }
        }
        return result;
    }
}