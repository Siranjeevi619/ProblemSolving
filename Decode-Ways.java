class Solution {
    public int numDecodings(String s) {
        int [] mem = new int[s.length()];
           Arrays.fill(mem, -1);
        return dp(0, s, mem);
    }

    static int dp(int index, String s, int [] mem) {
        int strSize = s.length();
        if ( strSize == 0) {
            return 0;
        }
        if (index == strSize)
            return 1;
        if (s.charAt(index) == '0')
            return 0;
            if(mem[index] != -1 ){
                return mem[index];
            }
        int res = dp(index + 1, s, mem);
        if (index < strSize - 1 && (s.charAt(index) == '1' || s.charAt(index) == '2' && s.charAt(index + 1) < '7')) {
            res += dp(index + 2, s, mem);
        }
        return mem[index]  = res;
    }
}