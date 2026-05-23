class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(char ch: s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }
        int res = 0;
        boolean isOdd = false;
        for(int count : mpp.values()){
            if(count % 2 == 0){
                res += count;
            }
            else{
                res += count - 1;
                isOdd = true;
            }
        }
        if(isOdd){
            res +=1;
        }
        return res;
    }
}