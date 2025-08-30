class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i += 1) {
            Set<Character> st = new HashSet<>();
            for (int j = 0; j < 9; j += 1) {
                char curr = board[i][j];
                if (curr != '.' && !st.add(curr)) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i += 1) {
            Set<Character> st = new HashSet<>();
            for (int j = 0; j < 9; j += 1) {
                char curr = board[j][i];
                if (curr != '.' && !st.add(curr)) {
                    return false;
                }
            }
        }
        int[][] starts = { { 0, 0 }, { 0, 3 }, { 0, 6 },
                { 3, 0 }, { 3, 3 }, { 3, 6 },
                { 6, 0 }, { 6, 3 }, { 6, 6 } };

       for(int [] start : starts){
             Set<Character> st = new HashSet<>();
         for(int i = start[0] ; i < start[0]+3 ; i+=1 ){
            for(int j = start[1] ; j < start[1]+3 ; j +=1){
                char curr = board[i][j];
                if(curr != '.' && !st.add(curr)){
                    return false;
                }
            }
        }
       }
        return true;
    }
}