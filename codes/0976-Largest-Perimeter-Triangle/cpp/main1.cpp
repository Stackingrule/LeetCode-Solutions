class Solution
{
public:
    int largestPerimeter(vector<int> &A)
    {
        sort(rbegin(A), rend(A));
        for (int i = 0; i < A.size() - 2; ++i)
            if (A[i] < A[i + 1] + A[i + 2])
                return A[i] + A[i + 1] + A[i + 2];
        return 0;
    }
};