class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int ans = n;
        for (int i = n - 1; i >= 0; i--){
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++){
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = j - i == 1 ? 1 : dp[i + 1][j - 1];
                    ans += dp[i][j] == 1 ? 1 : 0;
                }
            }
        }
        return ans;
    }
}