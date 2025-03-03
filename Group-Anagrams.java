class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mpp = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            if(!mpp.containsKey(sorted)){
                mpp.put(sorted, new ArrayList<>() );
            }
            mpp.get(sorted).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}