class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if(mpp.containsKey(st)){
                List<String> ls = mpp.get(st);
                ls.add(s);
                mpp.put(st, ls);
            }
            else{
                  List<String> ls = new ArrayList<>();
                  ls.add(s);
                mpp.put(st, ls);
            }
        }
        res.addAll(mpp.values());
        return res;
    }
}