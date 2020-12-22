class Solution
{
public:
    int maxScore(string s)
    {
        int n = s.length();
        vector<int> z(n, 0), o(n, 0);
        if (s.front() == '0')
            z[0] = 1;

        for (int i = 1; i < n; i++)
            z[i] = z[i - 1] + int(s[i] == '0');

        if (s.back() == '1')
            o[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--)
            o[i] = o[i + 1] + int(s[i] == '1');

        int ans = 0;
        for (int i = 1; i < n; i++)
            ans = max(ans, z[i - 1] + o[i]);

        return ans;
    }
};