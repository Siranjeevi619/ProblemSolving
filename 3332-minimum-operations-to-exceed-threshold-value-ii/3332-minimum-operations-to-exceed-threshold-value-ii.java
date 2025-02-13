class Solution {

    public int minOperations(int[] nums, int k) {
        int count = 0 ;
        PriorityQueue <Long> queue = new PriorityQueue<>();
        int numsSize = nums.length; 
        for(int i = 0 ; i < numsSize ; i+=1){
            queue.add((long)nums[i]);
        }
        while(queue.peek() < k){
            long x = queue.poll();
            if(!queue.isEmpty()){
                long y = queue.poll();
                long newElement = Math.min(x,y) * 2 + Math.max(x,y);
                queue.offer(newElement);
                count+=1;
            }
            else{
                break;
            }
        }
        return count;
    }
}