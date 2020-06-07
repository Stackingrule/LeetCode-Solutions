class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        int L = 0;
        for (int i = 0; i < s.length(); ++i) {
        	if (s.charAt(i) == 'A') ++A;
        	if (s.charAt(i) == 'L') ++L;
        	else L = 0;
        	if (A > 1 || L > 2) return false;
        }
        return true;
    }
}