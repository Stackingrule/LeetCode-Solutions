class Solution {
    public int evalRPN(String[] tokens) {
        String operators = "+-*/";
        Stack<Integer> stack = new Stack<Integer>();
        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(Integer.valueOf(token));
                 continue;
            }

            int num1 = stack.pop();
            int num2 = stack.pop();
            if (token.equals("+")) stack.push(num2 + num1);
            if (token.equals("-")) stack.push(num2 - num1);
            if (token.equals("*")) stack.push(num2 * num1);
            if (token.equals("/")) stack.push(num2 / num1);
        }
        return stack.pop();   
    }
}