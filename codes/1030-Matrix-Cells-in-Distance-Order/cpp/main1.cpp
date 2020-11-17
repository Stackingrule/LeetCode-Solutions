class Solution
{
public:
    vector<vector<int>> allCellsDistOrder(int R, int C, int r0, int c0)
    {
        vector<vector<int>> res = {{r0, c0}};
        for (auto level = 1; level < R + C - 1; ++level)
        {
            for (int x = -level; x <= level; ++x)
            {
                int r1 = r0 + x;
                int c1_a = c0 + level - abs(x);
                int c1_b = c0 + abs(x) - level;
                if (r1 >= 0 && r1 < R)
                {
                    if (c1_a >= 0 && c1_a < C)
                    {
                        res.push_back({r1, c1_a});
                    }
                    if (c1_a != c1_b && c1_b >= 0 && c1_b < C)
                    {
                        res.push_back({r1, c1_b});
                    }
                }
            }
        }
        return res;
    }
};