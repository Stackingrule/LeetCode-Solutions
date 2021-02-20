class Solution
{
public:
    int minFlipsMonoIncr(string S)
    {
        int n = S.size(), res = 0, cnt1 = 0;
        for (int i = 0; i < n; ++i)
        {
            (S[i] == '0') ? ++res : ++cnt1;
            res = min(res, cnt1);
        }
        return res;
    }
};