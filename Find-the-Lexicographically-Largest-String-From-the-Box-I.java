class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) {
            return word;
        }
        int wordSize = word.length();
        int maxPossible = wordSize - numFriends + 1;
        String res = "";

        for (int i = 0; i < wordSize; i += 1) {
                String sub;
                if (i + maxPossible <= wordSize) {
                    sub = word.substring(i, i + maxPossible);
                } else {
                    sub = word.substring(i);
                }
                if (sub.compareTo(res) > 0) {
                    res = sub;
                }
        }
        return res;
    }
}