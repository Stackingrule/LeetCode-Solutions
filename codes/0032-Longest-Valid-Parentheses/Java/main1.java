class Solution {
    public int longestValidParentheses(String s) {
        Deque<int[]> stack = new LinkedList<>();
        int res = 0;

        for (int i = 0; i < s.length(); ++i) {
        	char c = s.charAt(i);
        	if (c == ')') {
        		if (!stack.isEmpty() && stack.peek()[0] == 0) {
        			stack.pop();
        			res = Math.max(res, i - (stack.isEmpty() ? -1 : stack.peek()[1]));
        		}
        		else {
        			stack.push(new int[]{1, i});
        		}
        	}
        	else {
        		stack.push(new int[]{0, i});
        	}
        }
        return res;
    }
}