class Solution {
public:
    int dx[4] = {-1, 0, 1, 0};
    int dy[4] = {0, 1, 0, -1};
    vector<vector<int>> highestPeak(vector<vector<int>>& isWater) {
        int m = isWater.size(), n = isWater[0].size();
        vector<vector<int>> ans(m, vector<int>(n, -1));
        queue<pair<int, int>> q;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    q.push({ i, j });
                }
            }
        }

        int high = 0;
        while (!q.empty()) {
            int size = q.size();
            high++;
            for (int i = 0; i < size; ++i) {
                auto t = q.front();
                q.pop();
                for (int di = 0; di < 4; ++di) {
                    int x = t.first + dx[di];
                    int y = t.second + dy[di];
                    if (x >= 0 && x < m && y >= 0 && y < n && ans[x][y] == -1) {
                        ans[x][y] = high;
                        q.push({ x, y });
                    }
                }
            }
        }

        return ans;
    }
};