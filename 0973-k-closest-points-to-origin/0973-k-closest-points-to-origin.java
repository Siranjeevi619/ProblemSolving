class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        for(int [] p : points){
            pq.offer(p);
        }
        int [][] res = new int[k][2];
        int i = 0, j = 0;
        while(k > 0){
            res[i] = pq.poll();
             i+=1;
             k-=1;
        }
        return res;
        
    }
}