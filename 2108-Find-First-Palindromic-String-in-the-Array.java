class Solution {
    static boolean isPalindrome(String word){
        // String word = word
         StringBuilder w = new StringBuilder(word);
        return word.equals(w.reverse().toString());
    }
    public String firstPalindrome(String[] words) {
        int wordsLength = words.length;
        for(int i = 0 ;i <wordsLength; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}