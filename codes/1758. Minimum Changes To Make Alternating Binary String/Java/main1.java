class Solution {
    public int minOperations(String s) {
        if (s.length() == 0 || s.length() == 1)
            return 0;
        int n = s.length();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < n; ++i) {
            s1 = i % 2 == 0 ? s1 + '0' : s1 + '1';
            s2 = i % 2 == 1 ? s2 + '0' : s2 + '1';
        }
        int ans1 = 0, ans2 = 0;
        for (int i = 0; i < n; ++i) {
            if (s1.charAt(i) != s.charAt(i)) {
                ++ans1;
            }
            if (s2.charAt(i) != s.charAt(i)) {
                ++ans2;
            }
        }

        return Math.min(ans1, ans2);
    }
}