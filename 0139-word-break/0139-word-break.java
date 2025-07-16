class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int sSize = s.length();
        boolean [] dp = new boolean[sSize + 1];
        dp[0] = true;
        for(int i = 1; i <= sSize;i+=1){
            for(String w : wordDict){
                int start = i- w.length();
                if(start >= 0 && dp[start] && s.substring(start, i).equals(w) ){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[sSize];

    }
}