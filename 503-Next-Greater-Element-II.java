class Solution {
    // static int ne(int [] nums)
    public int[] nextGreaterElements(int[] nums) {
        int numsSize = nums.length;
        // int [] result = new int[numsSize];
        Stack <Integer> stack = new Stack<>();
        int temp = 0;
        for(int i = 2*  numsSize -1 ; i >=0 ; i-=1){
            while(!stack.isEmpty() && stack.peek() <= nums[i % numsSize]){
                stack.pop();
            }
            if(i < numsSize){
                temp = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i % numsSize]);
            nums[i % numsSize] = temp;
        }
        return nums;
    }
}