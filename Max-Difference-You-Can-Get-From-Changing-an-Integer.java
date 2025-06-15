class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        char toReplaceMax = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        StringBuilder maxNum = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == toReplaceMax) {
                maxNum.append('9');
            } else {
                maxNum.append(c);
            }
        }

        char first = s.charAt(0);
        char toReplaceMin = ' ';
        char replacement = ' ';
        if (first != '1') {
            toReplaceMin = first;
            replacement = '1';
        } else {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != first) {
                    toReplaceMin = s.charAt(i);
                    replacement = '0';
                    break;
                }
            }
        }

        StringBuilder minNum = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == toReplaceMin) {
                minNum.append(replacement);
            } else {
                minNum.append(c);
            }
        }

        int max = Integer.parseInt(maxNum.toString());
        int min = Integer.parseInt(minNum.toString());
        return max - min;
    }
}
