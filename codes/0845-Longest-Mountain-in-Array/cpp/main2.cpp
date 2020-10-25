class Solution
{
public:
    int longestMountain(vector<int> &A)
    {
        int res = 0, up = 0, down = 0, n = A.size();
        for (int i = 1; i < n; ++i)
        {
            if ((down && A[i - 1] < A[i]) || (A[i - 1] == A[i]))
            {
                up = down = 0;
            }
            if (A[i - 1] < A[i])
                ++up;
            if (A[i - 1] > A[i])
                ++down;
            if (up > 0 && down > 0)
                res = max(res, up + down + 1);
        }
        return res;
    }
};