class Solution {
    public int numberOfSubstrings(String s) {
   
        int count = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        mpp.put('a', -1);
        mpp.put('b', -1);
        mpp.put('c', -1);
        for(int i = 0 ; i < s.length() ; i +=1){
            mpp.put(s.charAt(i), i);
            if(mpp.get('a') != -1 && mpp.get('b') != -1 && mpp.get('c') != -1){
                count += 1 + Math.min(mpp.get('a') , Math.min(mpp.get('c'), mpp.get('b')  ));
            }
        }
        return count;
    }
}