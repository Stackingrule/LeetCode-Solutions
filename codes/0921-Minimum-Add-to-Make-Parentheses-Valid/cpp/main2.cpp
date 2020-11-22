class Solution
{
public:
    int minAddToMakeValid(string S)
    {
        int res = 0, cnt = 0;
        for (char c : S)
        {
            if (c == '(')
            {
                if (cnt < 0)
                {
                    res += abs(cnt);
                    cnt = 0;
                }
                ++cnt;
            }
            else
            {
                --cnt;
            }
        }
        return res + abs(cnt);
    }
};