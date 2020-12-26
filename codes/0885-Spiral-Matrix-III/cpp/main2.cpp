class Solution
{
public:
    vector<vector<int>> spiralMatrixIII(int R, int C, int r0, int c0)
    {
        vector<vector<int>> res{{r0, c0}};
        vector<int> dirX{0, 1, 0, -1}, dirY{1, 0, -1, 0};
        int step = 0, cur = 0;
        while (res.size() < R * C)
        {
            if (cur == 0 || cur == 2)
                ++step;
            for (int i = 0; i < step; ++i)
            {
                r0 += dirX[cur];
                c0 += dirY[cur];
                if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C)
                    res.push_back({r0, c0});
            }
            cur = (cur + 1) % 4;
        }
        return res;
    }
};