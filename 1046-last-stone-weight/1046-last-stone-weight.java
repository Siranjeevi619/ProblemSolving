class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int top = pq.poll();
            int top2 = pq.poll();
            if(top != top2){
                pq.offer(Math.abs(top2 - top));
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}