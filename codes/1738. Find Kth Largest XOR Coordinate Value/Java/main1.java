class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int[] ans = new int[m * n];
        int K = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 方便代码处理边界，下标从1开始
                dp[i][j] = dp[i - 1][j] ^ dp[i][j - 1] ^ dp[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                ans[K++] = dp[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[m*n-k];
    }    
}