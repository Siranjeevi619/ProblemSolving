class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int [] acc : accounts){
            int count = 0;
            for(int i : acc){
                count += i;
            }
            max = Math.max(max , count);
        }
        return max;
    }
}