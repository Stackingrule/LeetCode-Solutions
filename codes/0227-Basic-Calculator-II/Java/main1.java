class Solution {
    public int calculate(String s) {
        long res = 0, num = 0, n = s.length();
        char op = '+';
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; ++i) {
        	if (s.charAt(i) >= '0') {
        		num = num * 10 + s.charAt(i) - '0';
        	}
        	if ((s.charAt(i) < '0' && s.charAt(i) != ' ') || i == n - 1) {
        		if (op == '+') st.push(num);
        		if (op == '-') st.push(-num);
        		if (op == '*' || op == '/') {
        			int tmp = (op == '*') ? st.peek() * num : st.peek() / num;
        			st.pop();
        			st.push(tmp);
        		}
        		op = s.charAt(i);
        		num = 0;
        	}
        }
        while (!st.isEmpty()) {
        	res += st.peek();
        	st.pop();
        }

        return res;
    }
}