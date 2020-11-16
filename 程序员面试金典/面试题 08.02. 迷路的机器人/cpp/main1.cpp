class Solution
{
public:
    vector<vector<int>> pathWithObstacles(vector<vector<int>> &obstacleGrid)
    {
        vector<vector<int>> res;
        int r = obstacleGrid.size();
        if (r == 0)
            return {};
        if (r == 1 && obstacleGrid[0].size() == 1)
        {
            if (obstacleGrid[0][0] == 1)
            {
                return {};
            }
            else
            {
                res.push_back({0, 0});
                return res;
            }
        }
        int c = obstacleGrid[0].size();
        if (obstacleGrid[0][0] == 1)
            return {};
        res.push_back({0, 0});
        if (back_trace(obstacleGrid, res, 0, 0))
        {
            return res;
        }
        else
        {
            return {};
        }
    }

    bool back_trace(vector<vector<int>> &obstacleGrid, vector<vector<int>> &res, int r, int c)
    {
        if (r == obstacleGrid.size() - 1 && c == obstacleGrid[0].size() - 1)
        {
            return true;
        }

        int dx[2] = {0, 1};
        int dy[2] = {1, 0};
        obstacleGrid[r][c] = 2;
        for (int k = 0; k < 2; k++)
        {
            int x = dx[k] + r;
            int y = dy[k] + c;
            if (x >= 0 && x < obstacleGrid.size() && y >= 0 && y < obstacleGrid[0].size())
            {
                if (obstacleGrid[x][y] == 0)
                {
                    obstacleGrid[x][y] = 2;
                    res.push_back({x, y});
                    if (back_trace(obstacleGrid, res, x, y))
                    {
                        return true;
                    }
                    obstacleGrid[x][y] = 3;
                    res.pop_back();
                }
            }
        }
        obstacleGrid[r][c] = 0;
        return false;
    }
};