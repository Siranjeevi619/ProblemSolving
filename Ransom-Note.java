class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mgMap = new HashMap<>();
        
        for (char mg : magazine.toCharArray()) {
            mgMap.put(mg, mgMap.getOrDefault(mg, 0) + 1);
        }

        for (char rm : ransomNote.toCharArray()) {
            if (!mgMap.containsKey(rm) || mgMap.get(rm) == 0) {
                return false; 
            }
            mgMap.put(rm, mgMap.get(rm) - 1);
        }

        return true;
    }
}