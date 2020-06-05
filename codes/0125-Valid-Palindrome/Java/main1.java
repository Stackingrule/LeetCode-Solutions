class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
        	return false;
        }
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
        	while (left < right && !isAlphaNum(s.charAt(left))) {
        		left++;
        	}
        	while (left < right && !isAlphaNum(s.charAt(right))) {
        		right--;
        	}
        	if (s.charAt(left) != s.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
        return true;
    }

    private boolean isAlphaNum(char ch) {
    	if (ch >= 'a' && ch <= 'z') return true;
    	if (ch >= 'A' && ch <= 'Z') return true;
    	if (ch >= '0' && ch <= '9') return true;
    	return false;
    }
}