class Pair{
    int row;
    int col;
    int dist;
    public Pair(int row, int col, int dist){
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int size = grid.length;
        // if()
        if(grid[0][0] != 0 || grid[size-1][size-1] != 0) return -1;

        boolean [][] visited = new boolean[size][size];
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0,0,1));
        visited[0][0] = true;
        int [][] dir = {
            {0, -1}, {0, 1}, {1, 0}, {-1, 0}, {-1, -1}, {1, 1}, {-1, 1}, {1, -1}
        };
        while(!queue.isEmpty()){
            Pair node = queue.poll();
            int row = node.row;
            int col = node.col;
            int dist = node.dist;
            if(row ==  size -1 && col == size-1){
                return dist;
            }
            for(int [] g : dir){
                int currRow = row + g[0];
                int currCol = col + g[1];
                if (currRow >= 0 && currRow < size && currCol >= 0 && currCol < size 
                    && !visited[currRow][currCol] && grid[currRow][currCol] == 0){
                    visited[currRow][currCol] = true;
                    Pair newObj = new Pair(currRow, currCol, dist+1);
                    queue.offer(newObj);
                }
            }
        }
        return -1;
    }
}