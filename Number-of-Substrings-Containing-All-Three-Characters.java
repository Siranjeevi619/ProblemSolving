class Solution {

    public int numberOfSubstrings(String s) {
        int count = 0;
        int stringSize = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();
        int left = 0;
        for (int right = 0; right < stringSize; right += 1) {
            mpp.put(s.charAt(right), mpp.getOrDefault(s.charAt(right), 0) + 1);
            while (mpp.getOrDefault('a', 0) > 0 &&
                    mpp.getOrDefault('b', 0) > 0 &&
                    mpp.getOrDefault('c', 0) > 0) {
                count += stringSize - right;
                mpp.put(s.charAt(left), mpp.getOrDefault(s.charAt(left), 0)-1);
                left+=1;
            }

        }
        return count;
    }
}