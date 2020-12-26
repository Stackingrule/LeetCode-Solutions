class Solution
{
public:
    vector<vector<int>> spiralMatrixIII(int R, int C, int r0, int c0)
    {
        vector<vector<int>> res{{r0, c0}};
        int x = 0, y = 1, t = 0;
        for (int k = 0; res.size() < R * C; ++k)
        {
            for (int i = 0; i < k / 2 + 1; ++i)
            {
                r0 += x;
                c0 += y;
                if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C)
                    res.push_back({r0, c0});
            }
            t = x;
            x = y;
            y = -t;
        }
        return res;
    }
};
