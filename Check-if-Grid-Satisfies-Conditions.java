class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j += 1) {
                if ((j < colSize - 1 && grid[i][j] == grid[i][j + 1])) {
                    return false;
                }
                if ( ( i < rowSize - 1 && grid[i][j] != grid[i + 1][j] )) {
                    return false;
                }
            }
        }
        return true;
    }
}