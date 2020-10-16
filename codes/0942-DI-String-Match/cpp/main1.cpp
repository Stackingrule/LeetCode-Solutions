class Solution
{
public:
    vector<int> diStringMatch(string S)
    {
        vector<int> res;
        int n = S.size(), mn = 0, mx = n;
        for (char c : S)
        {
            if (c == 'I') res.push_back(mn++);
            else res.push_back(mx--);
        }
        res.push_back(mx);
        return res;
    }
};