class Solution {
public:
    vector<int> dirs {1, 0, -1, 0, 1};
    int orangesRotting(vector<vector<int>>& grid) {
        int n = grid.size(), m = grid[0].size();
        vector<vector<int>> vis(n, vector<int>(m, 0));
       
        queue<pair<int, int>> que;
        int tot = 0;
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j) {
                if (grid[i][j] == 2) {
                    //vis[i][j] = 1;
                    que.push({i, j});
                }
                if (grid[i][j] == 1) tot++;
            }
        }
       
        int step = 0;
       
        while(!que.empty() && tot) {
            step++;
            int size = que.size();
            while(size--) {
                auto cur = que.front();
                que.pop();
                int x = cur.first;
                int y = cur.second;
                for (int i=0; i<4; ++i) {
                    int nx = x + dirs[i];
                    int ny = y + dirs[i+1];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                    if (grid[nx][ny] == 0 || grid[nx][ny] == 2) continue;
                    grid[nx][ny] = 2;
                    tot--;
                    que.push({nx, ny});
                }
            }
        }
       
        return tot == 0 ? step : -1;
    }
};