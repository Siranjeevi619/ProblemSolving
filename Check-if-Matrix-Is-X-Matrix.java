public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the element is on either diagonal
                if (i == j || i + j == n - 1) {
                    // If it's on a diagonal, it must be non-zero
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    // If it's not on a diagonal, it must be zero
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
