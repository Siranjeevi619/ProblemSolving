class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
       Stack<Character> parenBag = new Stack<>();
       for(int i = 0;i<s.length();i++){
        char currentChar = s.charAt(i);
        if(currentChar == '(' || currentChar == '[' || currentChar == '{' ){
            parenBag.push(currentChar);
        }
        else{
            if(parenBag.isEmpty()){
                return false;
            }


           char openParenthesis = parenBag.peek();
             if( (currentChar == ')' && openParenthesis == '(') || (currentChar == ']' && openParenthesis == '[' ) || (currentChar == '}' && openParenthesis == '{' ) ){
                parenBag.pop();
            }
            else{
                return false;
            }
        }
        // parenBag.push(s.charAt(i));
       }

       return parenBag.isEmpty();
    }
}