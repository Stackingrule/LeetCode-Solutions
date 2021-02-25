class Solution
{
public:
    int scoreOfParentheses(string S)
    {
        int res = 0, n = S.size();
        for (int i = 0; i < n; ++i)
        {
            if (S[i] == ')')
                continue;
            int pos = i + 1, cnt = 1;
            while (cnt != 0)
            {
                (S[pos++] == '(') ? ++cnt : --cnt;
            }
            int cur = scoreOfParentheses(S.substr(i + 1, pos - i - 2));
            res += max(2 * cur, 1);
            i = pos - 1;
        }
        return res;
    }
};