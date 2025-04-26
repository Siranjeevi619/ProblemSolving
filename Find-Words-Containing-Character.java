class Solution {
    static boolean check(String word, char x){
        for(char ch : word.toCharArray()){
            if(ch == x){
                return true;
            }
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int idx = 0;
        for(String word : words){
            if(check(word, x)){
                res.add(idx);
            }
            idx++;
        }
        return res;
    }
}