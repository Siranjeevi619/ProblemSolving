class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for(String curr: tokens){
            if(curr.equals(\+\)){
                int top1 = st.pop();
                int top2 = st.pop();
                st.push(top1+ top2);
            }
            else if(curr.equals(\-\)){
                int top1 = st.pop();
                int top2 = st.pop();
                st.push(top2 - top1);
            }
            else if(curr.equals(\*\)){
                st.push(st.pop() * st.pop());
            }
            else if(curr.equals(\/\)){
               int top1 = st.pop();
                int top2 = st.pop();
                st.push(top2 / top1);
            }
            else{
                st.push(Integer.parseInt(curr));
            }
        }

        return st.peek();
    }
}