class Solution {
public:
    int dx[4] = {0, 1, 0, -1};
    int dy[4] = {1, 0, -1, 0};
    const int INF = 2147483647;
    void wallsAndGates(vector<vector<int>>& rooms) {
        int m = rooms.size(), n = rooms[0].size();
        queue<pair<int, int>> q;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (rooms[i][j] == 0) {
                    q.push({i, j});
                }
            }
        }

        while (!q.empty()) {
            auto t = q.front();
            q.pop();
            for (int i = 0; i < 4; ++ i) {
                int x = t.first + dx[i];
                int y = t.second + dy[i];
                if (x < 0 || x >= m || y < 0 || y >= n || rooms[x][y] != INF) continue;
                rooms[x][y] = rooms[t.first][t.second] + 1;
                q.push({x, y});
            }
        }
    }
};