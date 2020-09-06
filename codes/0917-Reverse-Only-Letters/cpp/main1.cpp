class Solution
{
public:
    string reverseOnlyLetters(string S)
    {
        string res = "";
        for (int i = S.size() - 1; i >= 0; --i)
        {
            if (isalpha(S[i]))
                res.push_back(S[i]);
        }
        for (int i = 0; i < S.size(); ++i)
        {
            if (isalpha(S[i]))
                continue;
            res.insert(res.begin() + i, S[i]);
        }
        return res;
    }
};