class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        param_map = {')' : '(', ']' : '[', '}' : '{'}
        for c in s:
        	if c not in param_map:
        		stack.append(c)
    		elif not stack or param_map[c] != stack.pop():
    			return False
		return not stack