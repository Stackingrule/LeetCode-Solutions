class Solution
{
public:
    vector<string> permutation(string S)
    {
        sort(S.begin(), S.end());
        vector<string> res;
        res.emplace_back(S);
        while (next_permutation(S.begin(), S.end())) {
            res.emplace_back(S);
        }
        return res;
    }
};
