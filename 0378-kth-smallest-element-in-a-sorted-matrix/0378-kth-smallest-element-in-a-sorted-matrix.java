class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int [] p : matrix){
            for(int q : p){
                pq.offer(q);
            }
        }
        while(--k > 0){
            pq.poll();
        }
        return pq.poll();
    }
}