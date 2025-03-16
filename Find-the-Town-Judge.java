class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;
        int trustSize = trust.length;
        int [] in = new int[n+1];
        int [] out = new int[n+1];
        // int a = 0, b = 0;
        for(int [] t : trust){
           int a = t[0], b = t[1];
           in[b]+=1;
           out[a]-=1;
        }
        for(int i =1 ; i <= n ; i+=1){
            if(in[i] == n-1 && out[i] == 0){
                return i;
            }
        }
        return -1;
    }
}