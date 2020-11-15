class Solution
{
public:
    string customSortString(string S, string T)
    {
        string res = "";
        vector<int> cnt(26, 0);
        for (char c : T)
            ++cnt[c - 'a'];
        for (char c : S)
        {
            while (cnt[c - 'a']-- > 0)
                res.push_back(c);
        }
        for (char c : T)
        {
            while (cnt[c - 'a']-- > 0)
                res.push_back(c);
        }
        return res;
    }
};