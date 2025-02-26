class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size1 = word1.length();
        int size2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int min = Math.min(size1, size2);
        while (start < min) {
            String curr = "";
            curr+= word1.charAt(start) ;
            curr+= word2.charAt(start);
            sb.append( curr);
            start += 1;
        }
        if (start < size2) {
            while (start < size2) {
                sb.append(word2.charAt(start));
                start += 1;
            }
        } else {
            while (start < size1) {
                sb.append(word1.charAt(start));
                start += 1;
            }

        }
        return new String(sb);
    }
}