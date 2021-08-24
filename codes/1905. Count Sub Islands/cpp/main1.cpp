class Solution {
public:
    int dx[4] = {-1, 0, 1, 0};
    int dy[4] = {0, 1, 0, -1};
    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
        int ans = 0;
        for (int i = 0; i < grid1.size(); ++i) {
            for (int j = 0; j < grid1[0].size(); ++j) {
                if (grid2[i][j] == 1 && bfs(grid1, grid2, i, j)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    bool bfs(vector<vector<int>>& grid1, vector<vector<int>>& grid2, int i, int j) {
        bool flag = true;
        queue<pair<int, int>> q;
        q.push({ i, j });
        grid2[i][j] = 0;
        if (grid1[i][j] != 1) flag = false;
        while (!q.empty()) {
            auto t = q.front();
            q.pop();
            for (int d = 0; d < 4; ++d) {
                int x = t.first + dx[d];
                int y = t.second + dy[d];
                if (x >= 0 && x < grid1.size() && y >= 0 && y < grid1[0].size() && grid2[x][y] == 1) {
                    q.push({ x, y });
                    grid2[x][y] = 0;
                    if (grid1[x][y] != 1) {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
};