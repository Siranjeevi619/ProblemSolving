class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // for(int i = 0;i<s.length();i++){
        //     frequencyMap.put(c)
        // }
        for(char c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }

        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        characters.sort((a,b) -> frequencyMap.get(b) - frequencyMap.get(a) );

        StringBuilder result = new StringBuilder();

        for(char c : characters){
            int freq = frequencyMap.get(c);
            for(int i = 0;i<freq;i++){
                result.append(c);
            }
        }

        return new String(result);
    }
}