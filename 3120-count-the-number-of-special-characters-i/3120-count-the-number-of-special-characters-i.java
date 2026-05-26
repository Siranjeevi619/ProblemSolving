class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for (char ch : word.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (char ch : set) {
            if(Character.isUpperCase(ch)){
                if(set.contains(Character.toLowerCase(ch))){
                    count +=1;
                }
            }
        }
        return count;
    }
}