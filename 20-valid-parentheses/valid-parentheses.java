class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    // st.pop();
                    return false;
                }
                if((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}')){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.isEmpty();
    }
}