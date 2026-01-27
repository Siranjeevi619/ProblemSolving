class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nSize = nums.length;
        Stack<Integer> st = new Stack<>();
        int [] res= new int[nums.length];

        for(int i = 2 * nSize -1 ; i>= 0 ; i-=1){
            while(!st.isEmpty() && st.peek() <= nums[i % nSize]){
                st.pop();
            }
            if(i < nSize){
                res[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i%nSize]);
        }
        return res;
    }
}