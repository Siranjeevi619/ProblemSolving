class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(char ch : word.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }
        List<Integer> freq = new ArrayList(mpp.values());
        Collections.sort(freq);
        int minDel =Integer.MAX_VALUE;
        for(int i = 0 ; i < freq.size();i++){
            int base = freq.get(i);
            int del = 0;
            for(int j = 0;j < i ;j+=1){
                del += freq.get(j);
            }
            for(int j = i + 1; j < freq.size() ;j++){
                if(freq.get(j) > base + k){
                    del += freq.get(j) - (base+ k);
                }
            }
            minDel = Math.min(minDel, del);
        }
        return minDel;
        
    }
}