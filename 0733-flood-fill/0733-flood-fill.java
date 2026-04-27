class Solution {
    static void dfs(int[][] image, boolean[][] visited, int i, int j, int color, int initialColor) {
        int rowSize = image.length;
        int colSize = image[0].length;
        if (i < 0 || j < 0 || i >= rowSize || j >= colSize || image[i][j] == color || visited[i][j] || image[i][j] != initialColor) {
            return;
        }
        visited[i][j] = true;
        image[i][j] = color;
        dfs(image, visited, i+1,j, color, initialColor);
        dfs(image, visited, i-1,j, color, initialColor);
        dfs(image, visited, i,j+1, color, initialColor);
        dfs(image, visited, i,j-1, color, initialColor);

        

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rowSize = image.length;
        int colSize = image[0].length;
        boolean[][] visited = new boolean[rowSize][colSize];
        int initialColor = image[sr][sc];
        
        dfs(image, visited, sr, sc, color, initialColor);
         
        return image;
    }
}