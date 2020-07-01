class Solution {
public:
    int movingCount(int m, int n, int k) {
        vector<vector<int>> visited(m, vector<int>(n, 0));
        queue<pair<int, int>> q;
        q.push({0, 0});
        int res = 0;
        visited[0][0] = 1;
        while (!q.empty()) {
            auto front = q.front(); q.pop();
            int x = front.first;
            int y = front.second;
            res += 1;
            for (auto d : directions) {
                int new_x = x + d.first;
                int new_y = y + d.second;
                if (new_x < 0 || new_x >= m || new_y < 0 || new_y >= n 
                    || visited[new_x][new_y] == 1 ||
                    sumDigit(new_x, new_y) > k) {
                    continue;
                }
                q.push({new_x, new_y});
                visited[new_x][new_y] = 1;
            }
        }
        return res;
    }
    int sumDigit(int i, int j) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j > 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }
private:
    vector<pair<int, int>> directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
};
