class Solution {
    static int check(int num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            sb.insert(0, num % 2);
            num /= 2;
        }
        String deci =  new String(sb);
        int count = 0;
        for(char ch : deci.toCharArray()) if(ch == '1') count+=1;
        return count;
    }
    
    public int[] countBits(int n) {
        int [] res = new int[n+1];
        res [0] = 0;
        for(int i = 1; i <= n ; i+=1){
            res[i] = check(i);
        }
        return res;
    }
}