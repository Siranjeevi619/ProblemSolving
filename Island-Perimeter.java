class Solution {
    static int check(int[][] grid, int row, int col) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        if (row < 0 || rowSize <= row || col < 0 || colSize <= col || grid[row][col] == 0) {
            return 1;
        }
        if (grid[row][col] == -1) {
            return 0;
        }
        grid[row][col] = -1;
        return check(grid, row, col+1) + check(grid, row, col-1) + check(grid, row-1, col) + check(grid, row+1, col);
    }

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;
        for (int i = 0; i < rowSize; i += 1) {
            for (int j = 0; j < colSize; j += 1) {
                if (grid[i][j] == 1) {
                    perimeter += check(grid, i, j);
                }
            }
        }
        return perimeter;
    }
}