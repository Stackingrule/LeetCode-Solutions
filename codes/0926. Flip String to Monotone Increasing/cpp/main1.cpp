class Solution
{
public:
    int minFlipsMonoIncr(string S)
    {
        int n = S.size(), ans = INT_MAX;
        vector<int> cnt1(n + 1), cnt0(n + 1);
        for (int i = 1, j - n - 1; j >= 0; ++i, --j)
        {
            cnt1[i] = cnt1[i - 1] + (S[i - 1] == '0' ? 0 : 1);
            cnt0[j] += cnt0[j + 1] + (S[j] == '1' ? 0 : 1);
        }
        for (int i = 0; i <= n; ++i)
            ans = min(ans, cnt1[i] + cnt0[i]);
        return ans;
    }
};