class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while (n != 0) {
        	int t = (n - 1) % 26;
        	s = (char)('A' + t) + s;
        	n = (n - 1) / 26;
        }
        return s;
    }
}