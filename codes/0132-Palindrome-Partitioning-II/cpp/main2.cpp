class Solution
{
public:
    int minCut(string s)
    {
        if (s.empty())
            return 0;
        int n = s.size();
        vector<vector<bool>> p(n, vector<bool>(n));
        vector<int> dp(n);
        for (int i = n - 1; i >= 0; --i)
        {
            dp[i] = n - i - 1;
            for (int j = i; j < n; ++j)
            {
                if (s[i] == s[j] && (j - i <= 1 || p[i + 1][j - 1]))
                {
                    p[i][j] = true;
                    dp[i] = (j == n - 1) ? 0 : min(dp[i], dp[j + 1] + 1);
                }
            }
        }
        return dp[0];
    }
};