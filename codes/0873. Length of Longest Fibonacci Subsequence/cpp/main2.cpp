class Solution
{
public:
    int lenLongestFibSubseq(vector<int> &A)
    {
        int res = 0, n = A.size();
        unordered_map<int, int> m;
        vector<vector<int>> dp(n, vector<int>(n));
        for (int i = 0; i < n; ++i)
        {
            m[A[i]] = i;
            for (int j = 0; j < i; ++j)
            {
                int k = m.count(A[i] - A[j]) ? m[A[i] - A[j]] : -1;
                dp[j][i] = (A[i] - A[j] < A[j] && k >= 0) ? (dp[k][j] + 1) : 2;
                res = max(res, dp[j][i]);
            }
        }
        return (res > 2) ? res : 0;
    }
};