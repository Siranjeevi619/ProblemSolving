
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rowSize = mat.length;
        int colSize = mat[0].length;
        Queue<int []> queue = new LinkedList<>();
        // boolean [][] visited = new boolean[rowSize][colSize];
        for(int i = 0 ;i < rowSize ; i+=1){
            for(int j = 0 ; j < colSize ; j+=1){
                if(mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }
                else{
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while(!queue.isEmpty()){
            int [] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            for(int [] dir : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow >= 0 && newCol >=0 && newRow < rowSize && newCol < colSize && mat[newRow][newCol] > mat[row][col] + 1){
                    mat[newRow][newCol] = mat[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
        return mat;
    }
}