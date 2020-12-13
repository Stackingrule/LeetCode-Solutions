class Solution
{
public:
    int countNegatives(vector<vector<int>> &grid)
    {
        const int M = grid.size(), N = grid[0].size();
        int c = N - 1, r = 0, res = 0;
        while (r < M)
        {
            if (c >= 0 && grid[r][c] < 0)
                --c;
            else
            {
                res += N - c - 1;
                ++r;
                c = N - 1;
            }
        }
        return res;
    }
};