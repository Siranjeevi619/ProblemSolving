class Solution {
   

    public int beautifulSubstrings(String s, int k) {
        int count = 0;
        int str = s.length();
        for (int i = 0; i < str; i += 1) {
              int vowels = 0;
                int consonants = 0;
            for (int j = i ; j < str; j += 1) {
                char ch = s.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                        || ch == 'u') {
                    vowels += 1;
                } else {
                    consonants += 1;
                }
                if((vowels == consonants) && (vowels * consonants) % k == 0 ) count+=1;
            }
        }
        return count;
    }
}