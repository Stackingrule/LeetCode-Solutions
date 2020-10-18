class Solution
{
public:
    int distinctSubseqII(string S)
    {
        int n = S.size(), res = 0, M = 1e9 + 7;
        unordered_map<char, long> m;
        vector<long> a(n), b(n);
        a[0] = 1;
        m[S[0]] = 0;
        for (int i = 1; i < n; ++i)
        {
            b[i] = (a[i - 1] + b[i - 1]) % M;
            if (!m.count(S[i]))
            {
                a[i] = (b[i] + 1) % M;
            }
            else
            {
                a[i] = (M + b[i] - m[S[i]]) % M;
            }
            m[S[i]] = b[i];
        }
        return (a.back() + b.back()) % M;
    }
};