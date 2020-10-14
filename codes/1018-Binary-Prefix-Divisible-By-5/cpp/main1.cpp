class Solution
{
public:
    vector<bool> prefixesDivBy5(vector<int> &A)
    {
        int n = A.size(), total = 0;
        vector<bool> ans;
        for (int i = 0; i < n; ++i)
        {
            total = total * 2 + A[i];
            total %= 5;
            ans.push_back(total == 0);
        }
        return ans;
    }
};