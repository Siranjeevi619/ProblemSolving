class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int  t : time){
           int r = t  % 60;
           int comp = (60 - r) % 60;
           count+= mpp.getOrDefault(comp, 0);
           mpp.put(r, mpp.getOrDefault(r,0)+1);
        }
        return count;
    }
}