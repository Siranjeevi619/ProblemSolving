class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    static void dfs(int [][] image , int row, int col , int color, int oldColor){
         int rowSize = image.length;
        int colSize = image[0].length;
        if( row < 0 || col < 0 || row >= rowSize || col >=colSize || image[row][col] != oldColor){
            return ;
        }
        image[row][col] = color;
        dfs(image, row + 1, col, color, oldColor);
        dfs(image, row - 1, col,  color, oldColor);
        dfs(image, row, col + 1,  color, oldColor);
        dfs(image, row, col - 1,  color, oldColor);
    }
}