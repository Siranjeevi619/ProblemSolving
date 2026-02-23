class Solution {

    static int highF(HashMap<Character, Integer> mpp) {
        int high = (int) -1e9;
        for (int val : mpp.values()) {
            high = Math.max(high, val);
        }
        return high;
    }

    static int lessF(HashMap<Character, Integer> mpp) {
        int less = (int) 1e9;
        for (int val : mpp.values()) {
            less = Math.min(less, val);
        }
        return less;
    }

    public int beautySum(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i += 1) {

            HashMap<Character, Integer> mpp = new HashMap<>();
            for (int j = i; j < s.length(); j += 1) {
                char ch = s.charAt(j);
                mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
                count += highF(mpp) - lessF(mpp);
            }

        }
        return count;
    }
}