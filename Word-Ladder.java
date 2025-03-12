class Pair{
    String word;
    int seq ;
    public Pair(String word, int seq){
        this.word = word;
        this.seq = seq;
    } 
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(beginWord, 1));
        Set<String> st = new HashSet<>();
        for(String ls : wordList){
            st.add(ls);
        }
        st.remove(beginWord);
        while(!queue.isEmpty()){
            Pair node = queue.poll();
            String word = node.word;
            int steps = node.seq;
            if(word.equals(endWord)){
                return steps;
            }
            for(int i = 0 ; i < word.length() ; i+=1){
                for(char ch = 'a' ; ch <= 'z'; ch+=1){
                    char [] wordArr = word.toCharArray();
                    wordArr[i] = ch;
                    String curr = new String(wordArr);
                    if(st.contains(curr)){
                        st.remove(curr);
                        queue.offer(new Pair(curr,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}