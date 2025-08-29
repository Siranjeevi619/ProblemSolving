class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0 || s.length() == 0) return "";

        int left = 0;
        int min = Integer.MAX_VALUE;
        int index = 0;

        HashMap<Character, Integer> mpp = new HashMap<>();
        for (char ch : t.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        int count = t.length();  

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (mpp.getOrDefault(ch, 0) > 0) {
                count -= 1;
            }
            mpp.put(ch, mpp.getOrDefault(ch, 0) - 1);

            while (count == 0) {
                if ((right - left + 1) < min) {
                    min = right - left + 1;
                    index = left;
                }

                char leftChar = s.charAt(left);
                mpp.put(leftChar, mpp.getOrDefault(leftChar, 0) + 1);
                if (mpp.get(leftChar) > 0) {
                    count += 1;
                }
                left += 1;
            }
        }

        return (min == Integer.MAX_VALUE) ? "" : s.substring(index, index + min);
    }
}
