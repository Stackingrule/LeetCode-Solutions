class Solution
{
public:
    vector<int> sortedSquares(vector<int> &A)
    {
        int n = A.size();
        int i = 0;
        while (i < n - 1 && A[i] < 0)
            i++;
        if (A[i] > 0)
            i--;
        int j = i + 1;
        vector<int> ans;
        while (i >= 0 || j < n)
        {
            if (i < 0 || j < n && abs(A[i]) >= abs(A[j]))
            {
                ans.push_back(A[j] * A[j]);
                j++;
            }
            else if (j >= n || i >= 0 && abs(A[i]) <= abs(A[j]))
            {
                ans.push_back(A[i] * A[i]);
                i--;
            }
        }
        return ans;
    }
};