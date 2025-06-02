class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.insert(0, n % 2);
            n /= 2;
        }
        String bin = new String (sb);
        int count =0 ;
        for(char ch : bin.toCharArray()) if(ch == '1') count++;
        return count;
    }
}