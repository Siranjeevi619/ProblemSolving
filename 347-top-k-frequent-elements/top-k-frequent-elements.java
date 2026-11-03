class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> mpp.get(a) -  mpp.get(b));

        for(int i : nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }

        for(int i : mpp.keySet()){
            queue.offer(i);
            while(queue.size() > k){
                queue.poll();
            }
        }
        
        int [] result = new int[queue.size()];
        int i = 0;
        while(queue.size() > 0){
            result[i] = queue.poll();
            i+=1;
        }
        return result;




    }
}