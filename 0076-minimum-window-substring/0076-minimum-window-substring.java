class Solution {
    static boolean isValid(HashMap<Character, Integer> tmpp, HashMap<Character, Integer> smpp) {
        for(char h : tmpp.keySet()){
            if(!smpp.containsKey(h) || tmpp.get(h) > smpp.get(h)){
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tmpp = new HashMap<>();
        HashMap<Character, Integer> smpp = new HashMap<>();

        for (char tch : t.toCharArray()) {
            tmpp.put(tch, tmpp.getOrDefault(tch, 0) + 1);
        }

        int left = 0;
        int minLen = (int) 1e9;
        int start=  0;

        for (int right = 0; right < s.length(); right += 1) {

            char chAtRight = s.charAt(right);
            smpp.put(chAtRight, smpp.getOrDefault(chAtRight, 0) + 1);

            while (  isValid(tmpp, smpp)) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char chAtLeft = s.charAt(left);
                smpp.put(chAtLeft, smpp.getOrDefault(chAtLeft, 0) - 1);
                if (smpp.get(chAtLeft) == 0) {
                    smpp.remove(chAtLeft);
                }
                left += 1;
            }


        }
        return minLen == (int) 1e9 ? "" : s.substring(start ,start + minLen );
    }
}