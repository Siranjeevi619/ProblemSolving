class Solution {
    public int numEnclaves(int[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean [][] visited = new boolean [rowSize][colSize];
        for(int i = 0 ; i < rowSize ; i+=1){
            for(int j = 0 ; j < colSize ; j +=1){
                if(grid[i][j] == 1 && (i == 0 || i == rowSize -1 || j == 0 || j== colSize-1 )){
                    queue.offer(new int[]{i,j});
                  visited[i][j] = true;
                }
            }
        }
            int[] dirRow = { -1, 0, 1, 0 };
        int[] dirCol = { 0, 1, 0, -1 };
        while(!queue.isEmpty()){
            int [] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            for(int i =  0 ; i < 4 ; i+=1){
                int currRow = dirRow[i]+ row;
                int currCol = dirCol[i]+ col;
                if(rowSize > currRow && colSize > currCol && currRow >= 0 && currCol >= 0 && visited[currRow][currCol] == false && grid[currRow][currCol] == 1){
                    visited[currRow][currCol] = true;
                    queue.offer(new int[]{currRow, currCol});
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < rowSize ; i+=1){
            for(int j = 0 ; j < colSize ; j+=1){
                if(!visited[i][j] && grid[i][j] == 1){
                    count +=1;
                }
            }
        }
        return count;

    }
}