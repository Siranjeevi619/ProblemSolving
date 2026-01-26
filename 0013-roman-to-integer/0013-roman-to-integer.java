class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        mpp.put('I', 1);
        mpp.put('V', 5);
        mpp.put('X', 10);
        mpp.put('L', 50);
        mpp.put('C', 100);
        mpp.put('D', 500);
        mpp.put('M', 1000);
        for(int i = 0 ; i < s.length() -1 ; i+=1){
            if(mpp.get(s.charAt(i)) >= mpp.get(s.charAt(i+1))){
                res += mpp.get(s.charAt(i));
            }
            else{
                res -= mpp.get(s.charAt(i));
            }
        }
        return res + mpp.get(s.charAt(s.length()-1));
    }
}