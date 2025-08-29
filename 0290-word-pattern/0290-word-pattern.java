class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (!charMap.containsKey(ch)) {
                charMap.put(ch, word);
            }
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, ch);
            }
            if (!charMap.get(ch).equals(word) || !wordMap.get(word).equals(ch)) {

                return false;
            }

        }
        return true;
    }
}