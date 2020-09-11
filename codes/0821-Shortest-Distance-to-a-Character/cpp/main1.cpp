class Solution
{
public:
    vector<int> shortestToChar(string S, char C)
    {
        const int n = S.length();
        vector<int> ans(n, INT_MAX);
        int index = -1;
        for (int i = 0; i < n; ++i)
        {
            if (S[i] == C)
                index = i;
            if (index < 0)
                continue;
            ans[i] = abs(i - index);
        }
        index = -1;
        for (int i = n - 1; i >= 0; --i)
        {
            if (S[i] == C)
                index = i;
            if (index < 0)
                continue;
            ans[i] = min(ans[i], abs(i - index));
        }
        return ans;
    }
};