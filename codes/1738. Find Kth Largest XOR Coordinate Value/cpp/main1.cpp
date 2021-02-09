class Solution
{
public:
    int kthLargestValue(vector<vector<int>> &mat, int k)
    {
        int m = mat.size(), n = mat[0].size();
        vector<vector<int>> dp(m + 1, vector<int>(n + 1, 0));
        vector<int> ans(m * n);
        int K = 0;
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // 方便代码处理边界，下标从1开始
                dp[i][j] = dp[i - 1][j] ^ dp[i][j - 1] ^ dp[i - 1][j - 1] ^ mat[i - 1][j - 1];
                ans[K++] = dp[i][j];
            }
        }
        sort(ans.begin(), ans.end());
        return ans[m * n - k];
    }
};