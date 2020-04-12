class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
        	return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] products = new int[m + n];
        for (int i = m - 1; i >= 0; --i) {
        	for (int j = n - 1; j >= 0; --j) {
        		products[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        	}
        }

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = m + n - 1; i >= 0; i--) {
        	int tmp = products[i] + carry;
        	sb.append(tmp % 10);
        	carry = tmp / 10;
        }

        sb.reverse();
        if (sb.charAt(0) == '0') {
        	sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}