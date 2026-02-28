class Solution {
    public int appendCharacters(String s, String t) {
        int iReach = 0;
        int sLeft = 0;
        int tLeft = 0;
        while(sLeft < s.length() && tLeft < t.length()){
            char sChar = s.charAt(sLeft);
            char tChar = t.charAt(tLeft);
            if(sChar == tChar){
                tLeft+=1;
            }
            sLeft +=1;
        }
        return t.length()  - tLeft;

        
    }
}