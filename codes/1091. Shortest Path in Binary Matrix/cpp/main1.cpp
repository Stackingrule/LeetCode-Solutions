using PII = pair<int, int>;
class Solution {

    int dx[8] = {0, 0, 1, 1, -1, -1, -1, 1}, dy[8] = {1, -1, 0, -1, 1, 0, -1, 1};
    int d[110][110];
    PII q[110 * 110];
public:
    // int dx[8] = {0, 0, 1, 1, -1, -1, -1, 1}, dy[8] = {1, -1, 0, -1, 1, 0, -1, 1};
    // static int d[110][110];
    // static PII q[110 * 110];

    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int n = grid.size();
        if (grid[0][0]) return -1;
        memset(d, -1, sizeof(d));
        d[0][0] = 0;
        q[0] = {0, 0};
        int hh = 0, tt = 0;
        while (hh <= tt) {
            PII t = q[hh ++];
            for (int i = 0; i < 8; ++i) {
                int x = dx[i] + t.first, y = dy[i] + t.second;
                if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 0 && d[x][y] == -1) {
                    d[x][y] = d[t.first][t.second] + 1;
                    q[++ tt] = {x, y};
                }
            }
        }

        return d[n - 1][n - 1] == -1 ? -1 : d[n - 1][n - 1] + 1;
    }
};

//int Solution::d[110][110] = {0, };
//PII Solution::q[110 * 110] = {PII{0, 0}, };