class Solution {
    public boolean isSubsequence(String s, String t) {
      int sSize = s.length();
      int tSize = t.length();
    
      int j = 0;
      for(int i = 0 ; i < tSize ; i+=1){
        if(sSize==j){
            return true;
        }
        if(t.charAt(i) == s.charAt(j)){
            j+=1;
        }
      }
      return j == sSize; 
  }
}