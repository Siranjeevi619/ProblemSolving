class Solution {

    public int countVowelSubstrings(String word) {
        int counter = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < word.length() - 4; i += 1) {
            set.clear();
            for (int j = i ; j < word.length(); j += 1) {
                char ch = word.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                    set.add(ch);
                    if (set.size() == 5) {
                        counter += 1;
                    }
                } else {
                    break;
                }

            }
        }
        return counter;
    }
}