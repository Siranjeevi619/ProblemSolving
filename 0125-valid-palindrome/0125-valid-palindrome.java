class Solution {
    public boolean isPalindrome(String s) {
        if(s== " "){
            return true;
        }
        String regex = "[^A-Za-z0-9]";
        String palin = s.replaceAll(regex, "").toLowerCase();

        int left = 0;
        int right = palin.length() -1 ;
        while(left < right){
            if(palin.charAt(left) != palin.charAt(right)){
                return false;
            }
            left+=1;
            right -=1;
        }
        return true;
    }
}