class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();

        if(sArray.length != tArray.length){
            return false;
        }


        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> s2 = new HashMap<>();

        for(int i = 0;i<s.length() ; i++){

            char a = s.charAt(i);
            char b = t.charAt(i);
            if(s1.containsKey(a) && s1.get(a) != b || s2.containsKey(b) && s2.get(b)!= a){
                return false;
            }
            s1.put(a,b);
            s2.put(b,a);
        }


        return true;


    }
}