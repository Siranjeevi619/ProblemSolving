class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> stack = new Stack<>();
        // while(stack)
        int n = num.length();
          if( n == k ){
            return \0\ ; 
        }
        for(int i = 0 ; i <n  ; i+=1){
            while(!stack.isEmpty() && k > 0 && stack.peek() - '0' > num.charAt(i) - '0'){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k-=1;
        }

            StringBuilder  res =new StringBuilder();
            while(!stack.isEmpty()){
                res.append(stack.pop());
            }
            res.reverse();
            int resSize = res.length();
            StringBuilder result = new StringBuilder();
            int zero = 0;
            for(int i = 0 ; i < resSize ; i+=1){
                if(res.charAt(i) == '0' && zero == 0){
                    continue;
                }
                else{
                    result.append(res.charAt(i));
                    zero = 1;
                }
            }
            if(result.length() == 0){
                result.append('0');
            }
            return result.toString();
    }
}