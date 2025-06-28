
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if (pq.size() > k) {
                pq.poll(); 
            }
        }

        List<Integer> indices = new ArrayList<>();
        while (!pq.isEmpty()) {
            indices.add(pq.poll()[1]);
        }

        Collections.sort(indices);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[indices.get(i)];
        }

        return result;
    }
}
