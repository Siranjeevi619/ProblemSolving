class Solution {
    static char dfs(char ch , boolean [] visited,  Map<Character, List<Character>> mpp  ){
        visited[ch - 'a'] = true;
        char minChar = ch;
        for(char neighbour : mpp.getOrDefault(ch, new ArrayList<>())){
            if(!visited[neighbour - 'a']){
                char cand = dfs(neighbour, visited, mpp );
                if(cand < minChar){
                    minChar = cand;
                }
            }
        }
        return minChar;
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Map<Character, List<Character>> mpp = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i+=1){
            char u = s1.charAt(i);
            char v = s2.charAt(i);
            if(!mpp.containsKey(u)){
                mpp.put(u, new ArrayList<>());
            }
            mpp.get(u).add(v);
            if(!mpp.containsKey(v)){
                mpp.put(v, new ArrayList<>());
            }
            mpp.get(v).add(u);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : baseStr.toCharArray()){
            boolean [] vis = new boolean[26];
            char min = dfs(ch, vis, mpp);
            sb.append(min);
        }
        return new String(sb);
    }
}