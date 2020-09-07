class Solution
{
public:
    string removeDuplicates(string s, int k)
    {
        vector<pair<char, int>> v;
        for (char &c : s)
        {
            if (v.empty() || v.back().first != c)
            {
                v.emplace_back(c, 1);
            }
            else if (v.back().first == c)
            {
                int cnt = ++v.back().second;
                if (cnt % k == 0)
                {
                    v.pop_back();
                }
            }
        }
        string res;
        for (const auto &p : v)
        {
            res.append(p.second, p.first);
        }
        return res;
    }
};