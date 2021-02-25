class Solution
{
public:
    int scoreOfParentheses(string S)
    {
        int res = 0, cnt = 0, n = S.size();
        for (int i = 0; i < n; ++i)
        {
            (S[i] == '(') ? ++cnt : --cnt;
            if (S[i] == ')' && S[i - 1] == '(')
                res += (1 << cnt);
        }
        return res;
    }
};