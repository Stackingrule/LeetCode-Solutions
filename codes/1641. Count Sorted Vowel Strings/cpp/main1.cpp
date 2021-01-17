class Solution
{
public:
    int countVowelStrings(int n)
    {
        vector<vector<int>> dp(5, vector<int>(n + 1, 0));
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (j == 0)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] += dp[i][j - 1];
                    if (i >= 1)
                    {
                        dp[i][j] += dp[i - 1][j];
                    }
                }
            }
        }
        return dp[4][n];
    }
};