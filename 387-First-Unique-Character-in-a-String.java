class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map  = new HashMap<>();
        int sSize = s.length();
        for(int i = 0; i< sSize ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        // int i = 0;
        int foundIndex = -1;
        for(int i = 0 ; i<sSize ; i++){
            if(map.get(s.charAt(i)) == 1){
                 foundIndex = i;
                 break;
            }
            // i+=1;
        }
        return foundIndex;
    }
}