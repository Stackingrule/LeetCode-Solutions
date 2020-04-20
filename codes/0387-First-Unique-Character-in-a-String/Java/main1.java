class Solution {
    public int firstUniqChar(String s) {
    	int[] m = new int[26];
    	for (int i = 0; i < s.length(); ++i) {
    		char ch = s.charAt(i);
    		m[ch - 'a']++;
    	}
    	for (int i= 0; i < s.length(); ++i) {
    		char ch = s.charAt(i);
    		if (m[ch - 'a'] == 1) {
    			return i;
    		}
    	}
    	return -1;
    }
}