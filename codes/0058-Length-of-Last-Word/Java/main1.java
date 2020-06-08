class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
        	if (s.charAt(i) != ' ') {
        		if (i != 0 && s.charAt(i - 1) == ' ') res = 1;
        		else ++res;
        	}
        }
        return res;
    }
}