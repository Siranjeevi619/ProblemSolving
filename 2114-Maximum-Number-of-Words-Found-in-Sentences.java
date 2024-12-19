class Solution {
    static int countWords(String sen){
        String [] senArray = sen.split(" ");
        return senArray.length;
    }
    public int mostWordsFound(String[] sentences) {
        int sentencesSize  = sentences.length;
        int [] result = new int[sentencesSize];
        for(int i = 0 ; i < sentencesSize; i++){
            int wordCount = countWords(sentences[i]);
            result[i] = wordCount;
        }
        Arrays.sort(result);

        return result[sentencesSize - 1];
    }
}