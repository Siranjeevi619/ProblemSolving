class Solution {
    static boolean isPrefixAndSuffix (String s1 , String s2){
        return s2.startsWith(s1) && s2.endsWith(s1);
    } 
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int wordsSize = words.length;
        for(int i = 0 ; i < wordsSize ; i +=1){
            for(int j = i + 1 ; j < wordsSize ; j+=1){
                if(isPrefixAndSuffix(words[i], words[j])){
                    count+=1;
                }
            }
        }
        return count;
    }
}