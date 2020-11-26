class Solution {
    public int minCut(String s) {
        int n = s.length();
        if (n == 0 || n == 1) {
            return 0;
        }
        int[] dp = new int[n];  // dp[i]: mincut of s[0:i]
        boolean[] pal = new boolean[n]; // palin[i][j]: if s[i:j] is palindrome
        pal[0] = true;                  // palin[0][0] = true
        int tmp = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            tmp = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (j+1>i-1 || pal[j+1])) {
                    pal[j] = true;
                    tmp = j==0? 0 : Math.min(tmp, dp[j-1]+1);
                } else {
                    pal[j] = false;
                }
            }
            dp[i] = tmp;
        }
        return dp[n-1];
    }
}