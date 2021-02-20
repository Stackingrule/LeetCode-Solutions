class Solution {
    public int minFlipsMonoIncr(String S) {
        int n = S.length();
        char[] s = S.toCharArray();
        int pre0 = s[0] == '1' ? 1 : 0;
        int pre1 = s[0] == '0' ? 1 : 0;
        int cur0 = 0, cur1 = 0;
        for (int i = 1; i < n; i++) {
            cur0 = pre0 + (s[i] == '0' ? 0 : 1);
            if (pre0 > pre1) {
                cur1 = pre1 + (s[i] == '1' ? 0 : 1);
            } else {
                cur1 = pre0 + (s[i] == '1' ? 0 : 1);
            }
            pre0 = cur0;
            pre1 = cur1;
        }
        return Math.min(cur0, cur1);
    }
}