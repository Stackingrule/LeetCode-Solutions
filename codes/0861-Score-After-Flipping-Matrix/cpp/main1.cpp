class Solution
{
public:
    int matrixScore(vector<vector<int>> &A)
    {
        int m = A.size(), n = A[0].size(), res = (1 << (n - 1)) * m;
        for (int j = 1; j < n; ++j)
        {
            int cnt = 0;
            for (int i = 0; i < m; ++i)
            {
                cnt += (A[i][j] == A[i][0]);
            }
            res += max(cnt, m - cnt) * (1 << (n - 1 - j));
        }
        return res;
    }
};