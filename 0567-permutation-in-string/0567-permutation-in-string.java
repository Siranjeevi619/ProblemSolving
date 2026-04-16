class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i += 1) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if(s1Map.equals(s2Map)){
            return true;
        }

        int left = 0;
        for(int right = s1.length() ; right < s2.length(); right +=1){
            s2Map.put(s2.charAt(right),  s2Map.getOrDefault(s2.charAt(right), 0) + 1);
            s2Map.put(s2.charAt(left),  s2Map.getOrDefault(s2.charAt(left), 0) - 1);

            if(s2Map.get(s2.charAt(left)) == 0){
                s2Map.remove(s2.charAt(left));
            }
             left+=1;
            if(s1Map.equals(s2Map)){
                return true;
            }
           
        }
        return false;


    }
}