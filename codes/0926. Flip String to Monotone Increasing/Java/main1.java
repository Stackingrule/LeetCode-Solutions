class solution {
    public int minFlipsMonoIncr(String S) {
        int n = S.length();
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = dp[i][1] = n + 1;
        }
        dp[0][0] = S.charAt(0) == '1' ? 1 : 0;
        dp[0][1] = S.charAt(0) == '0' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            int changeTo1 = S.charAt(i) == '1' ? 0 : 1;
            int changeTo0 = S.charAt(i) == '0' ? 0 : 1;
            dp[i][0] = Math.min(dp[i][0], dp[i - 1][0] + changeTo0);
            dp[i][1] = Math.min(dp[i][1], Math.min(dp[i - 1][0], dp[i - 1][1]) + changeTo1);       
        }
        return Math.min(dp[n - 1][0], dp[n - 1][1]);
    }
}
