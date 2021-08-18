class Solution {
public:
    int numEnclaves(vector<vector<int>>& A) {
        if (A.empty() || A[0].size() == 0) return 0;
        int ans = 0;
        int m = A.size(), n = A[0].size();
        queue<pair<int, int>> q;

        for (int i = 0; i < m; ++ i) {
            for (int j = 0; j < n; ++ j) {
                ans += A[i][j];
                if (i * j == 0 || i == m - 1 || j == n - 1) {
                    q.push({i, j});
                }
            }
        }

        while (!q.empty()) {
            auto t = q.front();
            q.pop();
            int x = t.first, y = t.second;
            if (x < 0 || x >= m || y < 0 || y >= n || A[x][y] != 1) continue;
            A[x][y] = 0;
            --ans;
            q.push({x + 1, y});
            q.push({x - 1, y});
            q.push({x, y + 1});
            q.push({x, y - 1});            
        }

        return ans;
    }
};