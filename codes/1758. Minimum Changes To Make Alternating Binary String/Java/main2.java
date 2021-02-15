class Solution {
    public int minOperations(String s) {
        if (s.length() == 0 || s.length() == 1)
            return 0;
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != s.charAt(i) - '0') {
                ans++;
            }
        }

        return Math.min(ans, n - ans);
    }
}