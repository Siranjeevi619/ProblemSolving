class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String st : tokens) {
            if (st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/")) {  int b = stack.pop();
                int a = stack.pop();
              
                switch (st) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(st));
            }
        }
        return stack.pop();
    }
}