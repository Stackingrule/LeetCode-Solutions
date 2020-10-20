class Solution
{
public:
    int repeatedNTimes(vector<int> &A)
    {
        int n = A.size();
        for (int i = 0; i < n - 2; ++i)
        {
            if (A[i] == A[i + 1] || A[i] == A[i + 2])
            {
                return A[i];
            }
        }
        return A[n - 1];
    }
};