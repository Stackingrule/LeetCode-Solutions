class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 1; --i) {
        	if (n % i == 0) {
        		int c = n / i;
        		StringBuilder sb = new StringBuilder();
        		String subS = s.substring(0, i);
        		for (int j = 0; j < c; ++j) {
        			sb.append(subS);
        		}
        		if (sb.toString().equals(s)) return true;        		        		
        	}
        }
        return false;
    }
}