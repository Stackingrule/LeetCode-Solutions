class Solution {
    public boolean backspaceCompare(String S, String T) {
        return helper(S).equals(helper(T));
    }

    private String helper(String s) {
    	StringBuilder sb = new StringBuilder();
    	for (char c : s.toCharArray()) {
    		if (c == '#') {
    			if (sb.length() > 0) 
    				sb.setLength(sb.length() - 1);
    		} else {
    			sb.append(c);
    		}
    	}
    	return sb.toString();
    }
}