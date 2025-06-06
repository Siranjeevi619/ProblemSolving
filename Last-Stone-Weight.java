class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);

        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int st1 = pq.poll();
            int st2 = pq.poll();
            pq.offer(Math.abs(st1  - st2));
        }

        return pq.poll();

    }
}