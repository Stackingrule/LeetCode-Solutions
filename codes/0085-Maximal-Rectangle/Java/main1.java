class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                dp[i][j] = (matrix[i][j] == '1') ? (j == 0 ? 1 : dp[i][j - 1] + 1) : 0;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int len = Integer.MAX_VALUE;
                for (int k = i; k < m; ++k) {
                    len = Math.min(len, dp[k][j]);
                    if (len == 0) break;
                    ans = Math.max(len * (k - i + 1), ans);
                }
            }
        }
        return ans;
    }
}