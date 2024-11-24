class Solution {
    public void setZeroes(int[][] matrix) {
       int row = matrix.length;
       int col = matrix[0].length;
        boolean[] rowMat = new boolean[row];
        boolean[] colMat = new boolean[col];
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(matrix[i][j] == 0){
                rowMat[i] = true;
                colMat[j] = true;
            }
        }
       } 
      for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowMat[i] || colMat[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}