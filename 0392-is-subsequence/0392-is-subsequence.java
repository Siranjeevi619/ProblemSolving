class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0){
            return !true;
        }
        int i = 0;
        int j = 0;
        while( j < t.length() && i < s.length()){
            char sChar = s.charAt(i);
            char tChar = t.charAt(j);
            if(sChar == tChar){
                i++;
            }
            j++;
        }
        return s.length()  == i;
    }
}