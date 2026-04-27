class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n ==1){
            return 1;
        }
        HashMap<Integer, Integer> aMpp = new HashMap<>();
        HashMap<Integer, Integer> bMpp = new HashMap<>();
        for (int[] t : trust) {
            aMpp.put(t[0], aMpp.getOrDefault(t[0], 0) + 1);
            bMpp.put(t[1], bMpp.getOrDefault(t[1], 0) + 1);
        }
        for (int i = 0; i <= n; i += 1) {
            if (aMpp.getOrDefault(i, 0) ==0 && bMpp.getOrDefault(i, 0) ==  n - 1) {
                return i;
            }
        }
        return -1;
    }
}