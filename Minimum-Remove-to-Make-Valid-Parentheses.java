class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        String str = "";
        for(int i =0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                continue;
            }
            else{
                if(ch == '('){
                    st.push(i);
                }
                else{
                    if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                        st.pop();
                    }
                    else{
                          st.push(i);
                    }
                  
                }
            }
        }
        HashSet<Integer> set = new HashSet<>(st);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i+=1){
            if(!set.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return new String(sb);

    }
}