class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }
        int even = (int) 1e9;
        int odd = (int) (-1e9);
        for(Map.Entry<Character, Integer> m : mpp.entrySet()){
            int curr = m.getValue();
            if(curr % 2 ==0){

                even = Math.min(even, curr);
            }
            else{
                odd = Math.max(odd, curr);
            }
        }
        return odd - even;
    }
}