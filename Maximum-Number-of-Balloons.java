class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(char ch : text.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0)+1);
        }
        return Math.min(Math.min(count.getOrDefault('b', 0), count.getOrDefault('a', 0)),
                        Math.min(count.getOrDefault('l', 0) / 2, 
                                 Math.min(count.getOrDefault('o', 0) / 2, 
                                          count.getOrDefault('n', 0))));
            
    }
}