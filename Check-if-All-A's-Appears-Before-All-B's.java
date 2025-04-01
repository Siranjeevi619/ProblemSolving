class Solution {
    public boolean checkString(String s) {
        int size = s.length();
        for(int i = 0 ; i < size  -1 ; i+=1 ){
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                return false;
            }
        }
        return true;
    }
}