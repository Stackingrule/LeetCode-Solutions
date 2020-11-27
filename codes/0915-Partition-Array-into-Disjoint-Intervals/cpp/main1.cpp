class Solution
{
public:
    int partitionDisjoint(vector<int> &A)
    {
        int n = A.size(), curMax = INT_MIN;
        vector<int> backMin(n, A.back());
        for (int i = n - 2; i >= 0; --i)
        {
            backMin[i] = min(backMin[i + 1], A[i]);
        }
        for (int i = 0; i < n - 1; ++i)
        {
            curMax = max(curMax, A[i]);
            if (curMax <= backMin[i + 1])
                return i + 1;
        }
        return 0;
    }
};