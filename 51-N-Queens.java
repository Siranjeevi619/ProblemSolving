class Solution {
    static boolean isSafe(int n, char [][] board, int row, int col){

        for(int i = 0 ; i<n ; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0 ; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col+1; i >= 0 && j <n ; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static void solve(char [][] board, int queenSize, List<List<String>> result, int row){

        if(row == queenSize){
            List<String> paths = new ArrayList<>();
            for(char [] queenRows : board){
                paths.add(new String(queenRows));
            }
            result.add(paths);
            return;
        }

        for(int i = 0 ; i< queenSize ; i++){
            if(isSafe(queenSize, board, row, i)){
                board[row][i] = 'Q';
                solve(board, queenSize, result,row + 1 );
                board[row][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(board, n, result, 0);
        return result;
    }
}