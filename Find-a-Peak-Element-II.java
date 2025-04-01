class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int row = 0, col = 0 , n = mat.length , m = mat[0].length;
       while(true){
        if(row+1 < n && mat[row+1][col] > mat[row][col]) row+=1;
        else if(row-1 >= 0 && mat[row-1][col] > mat[row][col]) row -=1;
        else if(col + 1 < m && mat[row][col+1] > mat[row][col]) col +=1;
        else if(col-1 >= 0 && mat[row][col-1] > mat[row][col]) col--;
        else return new int[]{row, col};
       } 
    }
}