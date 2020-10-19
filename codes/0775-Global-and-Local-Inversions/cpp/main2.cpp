class Solution
{
public:
    bool isIdealPermutation(vector<int> &A)
    {
        int n = A.size(), mx = INT_MIN;
        for (int i = 0; i < n - 2; ++i)
        {
            mx = max(mx, A[i]);
            if (A[i + 2] < mx)
                return false;
        }
        return true;
    }
};