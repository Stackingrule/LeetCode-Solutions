class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder res = new StringBuilder();
        int cnt = 0, n = S.length();
        for (int i = n - 1; i >= 0; --i) {
        	char c = S.charAt(i);
        	if (c != '-') {
        		res.append(c);
        		cnt++;
        		if (cnt == K) {
        			res.append('-');
        			cnt = 0;
        		}
        	}
        }
        if (res.length() != 0 && res.charAt(res.length() - 1) == '-') {
        	res.deleteCharAt(res.length() - 1);
        }

        return res.reverse().toString().toUpperCase();
    }
}