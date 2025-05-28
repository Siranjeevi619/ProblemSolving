class Solution {
    public int maxDepth(String s) {
        int res  = 0; 
        int count = 0 ;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count +=1;
                res = Math.max(count , res);
            }
            else if(ch == ')'){
                count -=1;
            }
        }
        return res;
    }
}