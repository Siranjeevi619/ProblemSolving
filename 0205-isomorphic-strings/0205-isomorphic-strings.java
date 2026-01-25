class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sStr = new HashMap<>();
        HashMap<Character, Character> tStr = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sStr.containsKey(sc)) {
                if (sStr.get(sc) != tc) return false;
            } else {
                sStr.put(sc, tc);
            }

            if (tStr.containsKey(tc)) {
                if (tStr.get(tc) != sc) return false;
            } else {
                tStr.put(tc, sc);
            }
        }
        return true;
    }
}
