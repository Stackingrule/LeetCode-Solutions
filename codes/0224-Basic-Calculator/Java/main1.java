class Solution {
    public int calculate(String s) {
        int res = 0, num = 0, sign = 1, n = s.length();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; ++i) {
        	char c = s.charAt(i);
        	if (c >= '0') {
        		num = num * 10 + (c - '0');
        	}
        	else if (c == '+' || c == '-') {
        		res += sign * num;
        		num = 0;
        		sign = (c == '+') ? 1 : -1;
        	}
        	else if (c == '(') {
        		st.push(res);
        		st.push(sign);
        		res = 0;
        		sign = 1;
        	}
        	else if (c == ')') {
        		res += sign * num;
        		num = 0;
        		res *= st.peek(); st.pop();
        		res += st.peek(); st.pop();
        	}
        }
        res += sign * num;
        return res;
    }
}