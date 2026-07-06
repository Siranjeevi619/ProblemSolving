class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String str : strs){
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);
            if(mpp.containsKey(newString)){
                List<String> response = mpp.get(newString);
                response.add(str);
                mpp.put(newString, response);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                mpp.put(newString, newList);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> ls : mpp.values()){
            res.add(ls);
        }
        return res;
    }
}