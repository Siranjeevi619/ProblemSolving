class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char prevOperator = '+';

        for (int i = 0; i <= s.length(); i++) {
            char ch = (i < s.length()) ? s.charAt(i) : '\\0';

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) && ch != ' ' || i == s.length()) {
                if (prevOperator == '+') stack.push(num);
                if (prevOperator == '-') stack.push(-num);
                if (prevOperator == '*') stack.push(stack.pop() * num);
                if (prevOperator == '/') stack.push(stack.pop() / num);

                prevOperator = ch;
                num = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}