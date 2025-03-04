class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st = new Stack<>();
      for(String s : operations){
        if(s.equals(\+\)){
            int first = st.pop();
            int second = st.pop();
            int add = first + second;
            st.push(second);
            st.push(first);
            st.push(add);
        }
        else if(s.equals(\D\)){
            st.push(st.peek() * 2);
        }
        else if(s.equals(\C\)){
            st.pop();
        }
        else{
            st.push(Integer.parseInt(s));
        }
      }
      int sum = 0 ;
      while(!st.isEmpty()){
        sum += st.pop();
      }
      return sum;
    }
}