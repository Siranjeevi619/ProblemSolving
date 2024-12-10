class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> ArrayOfK = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }

        int [] result = new int[k];
        PriorityQueue <Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        for (int i = 0;i<k ;i++){
            result[i] = pq.poll();
        }
        return result;

    }
}