class Solution
{
public:
    int oddCells(int n, int m, vector<vector<int>> &indices)
    {
        vector<vector<int>> a(n, vector<int>(m));
        for (const auto &idx : indices)
        {
            for (int x = 0; x < m; ++x)
                ++a[idx[0]][x];
            for (int y = 0; y < n; ++y)
                ++a[y][idx[1]];
        }
        int ans = 0;
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                ans += a[i][j] & 1;
        return ans;
    }
};