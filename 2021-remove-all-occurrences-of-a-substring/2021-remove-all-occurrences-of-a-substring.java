class Solution {
    public String removeOccurrences(String s, String part) {
        int l = part.length();
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + l);
        }
        return s;

    }
}