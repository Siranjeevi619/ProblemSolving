class Solution {
    static boolean checkVowel(char x) {
        if ((x == 'a' || x == 'e' || x == 'i' ||
                x == 'o' || x == 'u' || x == 'A' ||
                x == 'E' || x == 'I' || x == 'O' || x == 'U')) {
            return true;
        }
        return false;
    }

    static void swap(char [] arr, int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public String reverseVowels(String s) {
        int strSize = s.length();
        int left = 0;
        int right = strSize-1;
        if (strSize == 1) {
            return s;
        }
        char[] ch = s.toCharArray();
        while (left <= right) {
            if (checkVowel(ch[right]) && checkVowel(ch[left])) {
                swap(ch, left, right);
                left += 1;
                right -= 1;
            } else if (!checkVowel(ch[left])) {
                left += 1;
            } else {
                right -= 1;
            }

        }
        return new String(ch);
    }
}