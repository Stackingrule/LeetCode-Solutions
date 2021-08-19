class Solution {
public:
    int dx[4] = {-1, 0, 1, 0};
    int dy[4] = {0, 1, 0, -1};
    vector<vector<int>> colorBorder(vector<vector<int>>& grid, int row, int col, int color) {
        if (grid[row][col] == color) return grid;
        int m = grid.size(), n = grid[0].size();
        int oldColor = grid[row][col];
        set<pair<int, int>> visited;
        queue<pair<int, int>> q;
        q.push({row, col});
        visited.insert({row, col});

        while (!q.empty()) {
            auto t = q.front();
            q.pop();
            if (t.first == 0 || t.first == m - 1 || t.second == 0 || t.second == n - 1) {
                grid[t.first][t.second] = color;
            }
            for (int i = 0; i < 4; ++i) {
                int x = t.first + dx[i];
                int y = t.second + dy[i];
                if (x < 0 || x >= m || y < 0 || y >= n || visited.count({x, y})) continue;
                if (grid[x][y] == oldColor) {
                    q.push({x, y});
                    visited.insert({x, y});
                } else {
                    grid[t.first][t.second] = color;
                }
            }
        }
        return grid;
    }
};