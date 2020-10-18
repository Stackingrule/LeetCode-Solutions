class Solution
{
public:
    int distinctSubseqII(string S)
    {
        int M = 1e9 + 7;
        vector<int> dp(26);
        for (char c : S)
        {
            dp[c - 'a'] = accumulate(dp.begin(), dp.end(), 1L) % M;
        }
        return accumulate(dp.begin(), dp.end(), 0L) % M;
    }
};