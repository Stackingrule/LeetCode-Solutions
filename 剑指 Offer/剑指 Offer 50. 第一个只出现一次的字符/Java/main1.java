class Solution {
    public char firstUniqChar(String s) {
    	int[] hash = new int[256];
    	int n = s.length();
    	for (int i = 0; i < n; ++i) {
    		++hash[s.charAt(i)];
    	}
    	for (int i = 0; i < n; ++i) {
    		if (hash[s.charAt(i)] == 1) {
    			return s.charAt(i);
    		}
    	}
    	return ' ';
    }
}