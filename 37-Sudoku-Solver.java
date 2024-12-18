class Solution {
    static boolean isValid(char[][] board, int row, int col, char target) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == target) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == target) return false;
            }
        }

        return true;
    }

    static boolean solve(char[][] board, int row, int col) {

        if(row == 9 ){
            return true;
        }
        if (col == 9) {
         return   solve(board, row + 1, 0);
                //   return true;
                // return false;
        }

        if (board[row][col] != '.') {
           return solve(board, row, col + 1);
            // return false;
        }

        for (char num = '1'; num <= '9'; num ++) {
            boolean valid = isValid(board, row, col, num);
            if (valid) {
                board[row][col] = num;
                boolean done = solve(board, row, col+1);
                if(  done){
                    return true;
                }
                else{
                      board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        int[][] result = new int[9][9];
        solve(board, 0, 0);
    }
}