class Solution {
    public int numSub(String s) {
        long counter = 0;
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                res = 0;
            }
            else{
                res +=1;
                counter += res;
            }
        }
       
        return (int)(counter % (1e9+7));
    }
}