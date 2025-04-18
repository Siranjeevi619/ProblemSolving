class Solution {
    public String countAndSay(int n) {
        String s = \1\;
        for(int i = 1 ; i < n ; i +=1){
            s = helper(s);
        }
        return s;
    }
    static String helper(String s){
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for(int i = 1 ; i < s.length() ; i+=1){
            if(prev == s.charAt(i)){
                count +=1;
            }
            else{
                sb.append(count);
                sb.append(prev);
                prev = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(prev);
        return new String (sb);
    }
}