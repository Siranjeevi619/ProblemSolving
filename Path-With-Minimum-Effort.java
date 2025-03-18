class Pair {
    int dist;
    int row;
    int col;

    public Pair(int dist, int row, int col) {
        this.dist = dist;
        this.row = row;
        this.col = col;
    }

}

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rowSize = heights.length;
        int colSize = heights[0].length;

        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        int[][] visited = new int[rowSize][colSize];
        for (int i = 0; i < rowSize; i += 1) {
            for (int j = 0; j < colSize; j += 1) {
                visited[i][j] = (int) (1e9);
            }
        }
        int[][] dir = {
              {1,0},{-1,0},{0,1},{0,-1}
        };
        queue.offer(new Pair(0, 0, 0));
        visited[0][0] = 0;
        while (!queue.isEmpty()) {
            Pair node = queue.poll();
            int dist = node.dist;
            int row = node.row;
            int col = node.col;
            if (row == rowSize - 1 && col == colSize - 1) {
                return dist;
            }
            for (int[] it : dir) {
                int currRow = row + it[0];
                int currCol = col + it[1];
                if (currRow < rowSize && currRow >= 0 && currCol < colSize && currCol >= 0) {
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[currRow][currCol]), dist);
                    if (newEffort < visited[currRow][currCol]) {
                        visited[currRow][currCol] = newEffort;
                        queue.offer(new Pair(newEffort, currRow, currCol));
                    }
                }
            }
        }
        return 0;
    }
}