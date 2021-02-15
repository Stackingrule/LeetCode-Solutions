class Solution
{
public:
    int minOperations(string s)
    {
        if (s.size() == 0 || s.size() == 1)
            return 0;
        int n = s.size();
        int res = 0;
        for (int i = 0; i < n; i++)
        {
            if (i % 2 != s[i] - '0')
            {
                res++;
            }
        }

        return min(res, n - res);
    }
};