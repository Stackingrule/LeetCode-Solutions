class Solution
{
public:
    int numSub(string s)
    {
        constexpr int kMod = 1e9 + 7;
        long ans = 0;
        vector<int> dp(s.length() + 1);
        for (int i = 1; i <= s.length(); ++i)
        {
            dp[i] = s[i - 1] == '1' ? dp[i - 1] + 1 : 0;
            ans += dp[i];
        }
        return ans % kMod;
    }
};