class Solution
{
public:
    string customSortString(string S, string T)
    {
        string ans = "";
        unordered_map<char, int> m;
        for (char c : T) ++m[c];
        for (char c : S)
        {
            ans += string(m[c], c);
            m[c] = 0;
        }
        for (auto a : m)
        {
            ans += string(a.second, a.first);
        }
        return ans;
    }
};