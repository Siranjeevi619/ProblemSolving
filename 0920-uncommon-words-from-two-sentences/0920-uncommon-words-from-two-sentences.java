class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] sarr1 = s1.split(" ");
        String [] sarr2 = s2.split(" ");
        HashMap<String , Integer> mpp = new HashMap<>();
        for(String str : sarr1){
            mpp.put(str, mpp.getOrDefault(str, 0)+1);
        }

        for(String str : sarr2){
            mpp.put(str, mpp.getOrDefault(str, 0)+1);
        }
        ArrayList<String> ls = new ArrayList<>();
        for(Map.Entry<String, Integer> m : mpp.entrySet()){
            if(m.getValue() == 1){
                ls.add(m.getKey());
            }
        }
        return ls.toArray(new String[0]);

    }
}