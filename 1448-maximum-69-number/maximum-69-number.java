class Solution {
    public int maximum69Number(int num) {
        StringBuilder numStr = new StringBuilder(String.valueOf(num));

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '6') {
                numStr.setCharAt(i, '9');
                break;
            }
        }

        return Integer.parseInt(numStr.toString());
    }
}
