class Solution {

    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<int[]> p = new PriorityQueue<>(
                (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        for (int[] point : points) {
            p.offer(point);
        }
        for (int i = 0; i < k; i += 1) {
            res[i] = p.poll();
        }

        return res;

    }
}
