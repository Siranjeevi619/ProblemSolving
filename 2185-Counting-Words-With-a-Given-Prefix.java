class Solution {
    static boolean isPrefix(String a , String b){
        return a.startsWith(b);
    }
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int wordSize = words.length;
        for(int i = 0 ; i < wordSize ; i+=1){
            if(isPrefix(words[i], pref)){
                count +=1;
            }
        }
        return count;
    }

}