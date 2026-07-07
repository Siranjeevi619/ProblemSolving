class Solution {
    static void setMat(int [][] matrix){
        
    }
    public void setZeroes(int[][] matrix) {
        boolean [] row = new boolean[matrix.length];
        boolean [] col = new boolean[matrix[0].length];
        for(int i = 0 ; i < row.length ; i++){
            for(int j = 0; j < col.length ; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(col);
        // System.out.println(Arrays.deepToString(matrix));
        // System.out.println(Arrays.deepToString(matrix));

        for(int i = 0 ; i < row.length ; i++){
            for(int j = 0; j < col.length ; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}