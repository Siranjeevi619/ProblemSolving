class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> sMpp = new HashMap<>();
        HashMap<Character, Integer> tMpp = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            sMpp.put(ch, sMpp.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            tMpp.put(ch, tMpp.getOrDefault(ch, 0) + 1);
        }
        // if(sMpp.size){
        //     return false;
        // }
        if(!sMpp.equals(tMpp)){
            return false;
        }
        return true;
    }
}