class Solution
{
public:
    int minOperations(string s)
    {
        if (s.size() == 0 || s.size() == 1)
            return 0;
        int n = s.size();
        string x1;
        string x2;
        for (int i = 0; i < n; i++)
        {
            char c1 = i % 2 == 0 ? '0' : '1';
            char c2 = i % 2 == 1 ? '0' : '1';
            x1 += c1;
            x2 += c2;
        }
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < n; i++)
        {
            if (x1[i] != s[i])
            {
                res1++;
            }
            if (x2[i] != s[i])
            {
                res2++;
            }
        }

        return min(res1, res2);
    }
};