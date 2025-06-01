class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> charStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                n = n * 10 + (ch - '0');
            }
            else if(ch == '['){
            countStack.push(n);
                n = 0;
                charStack.push(sb);
                sb = new StringBuilder();

            }
            else if(ch == ']'){
                int k = countStack.pop();
                StringBuilder newChar = sb;
                sb = charStack.pop();
                while(k-- > 0){
                    sb.append(newChar);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return new String(sb);

    }
}