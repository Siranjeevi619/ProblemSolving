class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack();
        char [] charr = s.toCharArray();
        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if( (ch == 'a' && st.peek() == 'z')  || (ch == 'z' && st.peek() == 'a')){
                    st.pop();
                }
                else if( (ch == st.peek() -1) || (ch == st.peek() +1)){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        if(st.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return new String(sb);
    }
}