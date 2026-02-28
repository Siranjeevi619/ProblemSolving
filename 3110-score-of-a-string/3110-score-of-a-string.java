class Solution {
    public int scoreOfString(String s) {
        int count = 0;
        for(int i = s.length() - 2; i >= 0; i--){
            count += Math.abs((s.charAt(i) - 'a' ) - (s.charAt(i+1) - 'a') );
        }
        return count;
    }
}