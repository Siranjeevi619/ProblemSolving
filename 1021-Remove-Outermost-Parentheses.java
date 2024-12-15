class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character>
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char [] bracketsArray = s.toCharArray();
        int StringSize = bracketsArray.length;
        for(int i = 1;i<StringSize ; i++){
            if(bracketsArray[i] == '('){
                count += 1;
                sb.append('(');
            }
            else{
                if(count == 0){
                    i++;
                }
                else{
                    count -=  1;
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}