class Solution {

    static boolean solve(char[][] board, int row, int col, String word, int index){

        if(index == word.length()){
            return true;
        }
        if(row < 0 || col < 0 || col >= board[0].length || row >= board.length || board[row][col] != word.charAt(index) ){
            return false;
        }

        board[row][col] = '.';
        boolean up = solve(board, row-1, col, word, index+1);
        boolean down = solve(board, row+1, col, word, index+1);
        boolean left = solve(board, row, col-1, word, index+1);
        boolean right = solve(board, row, col + 1, word, index+1);
        board[row][col] = word.charAt(index);
        return (up || down || left || right);

    }
    public boolean exist(char[][] board, String word) {
        int rowSize = board.length;
        int colSize = board[0].length;

        // boolean result = solve(board, rowSize, colSize,word);
        // return result;
        
        for(int i = 0; i < rowSize ; i++){
            for(int j = 0 ; j < colSize ; j+=1){
                if(solve(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
}