class Solution {

struct Grid {
    int x;
    int y;
    int h;
    Grid(int x, int y, int h) : x(x) , y(y) , h(h) {}

    bool operator < (const Grid &grid) const {
        return h > grid.h;
    }
};

public:
    int trapRainWater(vector<vector<int>>& heightMap) {
        if (heightMap.empty()) return 0;
        int m = heightMap.size(), n = heightMap[0].size();
        int ans = 0;
        int mx = INT_MIN;
        priority_queue<Grid, vector<Grid>> q;
        vector<vector<bool>> visited(m, vector<bool>(n, false));
        vector<vector<int>> dir{{0,-1},{-1,0},{0,1},{1,0}};
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    //q.push({heightMap[i][j], i * n + j});
                    q.push({i, j, heightMap[i][j]});
                    visited[i][j] = true;
                }
            }
        }

        while (!q.empty()) {
            auto t = q.top();
            q.pop();
            for (int i = 0; i < 4; ++i) {
                int x = t.x + dir[i][0];
                int y = t.y + dir[i][1];
                int h = t.h;
                mx = max(mx, h);
                if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                    if (heightMap[x][y] < mx) {
                        ans += mx - heightMap[x][y];
                    }
                    visited[x][y] = true;
                    q.push({x, y, heightMap[x][y]});
                }
            }
        }

        return ans;
    }
};