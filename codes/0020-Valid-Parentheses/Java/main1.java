class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); ++i) {
        	if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
        	else {
        		if (stack.isEmpty()) return false;
        		if (s.charAt(i) == ')' && stack.peek() != '(') return false;
        		if (s.charAt(i) == ']' && stack.peek() != '[') return false;
        		if (s.charAt(i) == '}' && stack.peek() != '{') return false;
        		stack.pop();
        	}
        }
        return stack.isEmpty();
    }
}