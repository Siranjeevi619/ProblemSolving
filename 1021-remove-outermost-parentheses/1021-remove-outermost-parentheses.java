class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if (ch == '(' && count == 0){
                count+=1;
            }
            else if(ch == '(' && count >= 1){
                sb.append('(');
                count+=1;
            }
            else if(ch == ')' && count> 1){
                sb.append(')');
                count-=1;
            }
            else if(ch == ')' && count == 1){
                count-=1;
            }
        }
        return sb.toString();
    }
}