class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMpp = new HashMap<>();
        HashMap<Character, Character> tMpp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if ((sMpp.containsKey(sch) && sMpp.get(sch) != tch) || (tMpp.containsKey(tch) && tMpp.get(tch) != sch)) {
                return false;
            }
            sMpp.put(sch, tch);
            tMpp.put(tch, sch);
        }
        return true;

    }
}