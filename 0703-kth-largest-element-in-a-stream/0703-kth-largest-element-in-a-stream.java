class KthLargest {
    PriorityQueue<Integer> queue ;
    int k;


    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for(int i = 0; i < nums.length ; i+=1){
           add(nums[i]);
        }
    
    }
    
    public int add(int val) {
          if(queue.size () < k){
                queue.offer(val);
            }
          else  if(val> queue.peek()){
                queue.poll(); queue.offer(val);
            }
            return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */