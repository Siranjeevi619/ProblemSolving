class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int [] res = new int[temperatures.length];

        for(int i = temperatures.length - 1 ; i >= 0 ; i -=1){
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            res[i] = st.isEmpty() ? 0 : st.peek() - i ;
            st.push(i);
            
        }
        return res;
    }
}