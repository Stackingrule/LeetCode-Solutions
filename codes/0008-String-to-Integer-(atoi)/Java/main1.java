class Solution {
    public int myAtoi(String str) {
        // remove whitespaces
        str = str.trim();

        if (str == null || str.length() == 0) {
        	return 0;
        }
        double res = 0;
        int sign = 1;
        int startIndex = 0;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
        	startIndex++;
        }
        if (str.charAt(0) == '-') sign = -1;
        for (int i = startIndex; i < str.length(); ++i) {
        	if (str.charAt(i) < '0' || str.charAt(i) > '9') {
        		break;
        	}
        	int digitValue = (int)(str.charAt(i) - '0');
        	res = res * 10 + digitValue;
        }

        if (sign == -1) res = -res;

        if (res > Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }

        if (res < Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }

        return (int)res;
    }
}