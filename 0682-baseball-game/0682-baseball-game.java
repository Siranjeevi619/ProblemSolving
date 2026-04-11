class Solution {
    static  boolean isNumber(String s) {
    try {
        Integer.parseInt(s);
        return true;
    } catch (Exception e) {
        return false;
    }
}
    static boolean isCharacter(String s) {
        return s.length() == 1 && Character.isLetter(s.charAt(0));
    }

    static boolean isSymbol(String s) {
        return s.length() == 1 && !Character.isLetterOrDigit(s.charAt(0));
    }

    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations) {
            if (isNumber(s)) {
                st.push(Integer.parseInt(s));
            } else if (isCharacter(s)) {
                if (s.equals("C")) {
                    st.pop();
                }
                if (s.equals("D")) {
                    st.push(2 * st.peek());
                }
            } else if (isSymbol(s)) {
                if (st.size() >= 2) {
                    int firstNum = st.pop();
                    int secondNum = st.peek();
                    int sum = firstNum + secondNum;
                    st.push(firstNum);
                    st.push(sum);
                }
            }
        }
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    }
}