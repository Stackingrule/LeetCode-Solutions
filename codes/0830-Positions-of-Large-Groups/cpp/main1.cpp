class Solution
{
public:
    vector<vector<int>> largeGroupPositions(string s)
    {
        vector<vector<int>> res;
        int n = s.size(), i = 0, j = 0;
        while (j < n)
        {
            while (j < n && s[j] == s[i]) ++j;
            if (j - i >= 3) res.push_back({i, j - 1});
            i = j;
        }
        return res;
    }
};