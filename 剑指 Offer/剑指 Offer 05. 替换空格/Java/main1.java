class Solution {
    public String replaceSpace(String s) {
    	StringBuilder res = new StringBuilder();
        char[] str = s.toCharArray();
    	for (char c : str) {
    		if (c == ' ') {
    			res.append('%');
    			res.append('2');
    			res.append('0');
    		}
    		else {
    			res.append(c);
    		}
    	}
    	return res.toString();
    }
}