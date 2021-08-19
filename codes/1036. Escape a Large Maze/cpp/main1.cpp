class Solution {
public:
    int dx[4] = {-1, 0, 1, 0};
    int dy[4] = {0, 1, 0, -1};
    bool isEscapePossible(vector<vector<int>>& blocked, vector<int>& source, vector<int>& target) {
        unordered_set<long> visited;
        for (auto block : blocked) visited.insert(block[0] * 1e6 + block[1]);
        return bfs(visited, source, target) && bfs(visited, target, source);
    }

    bool bfs(unordered_set<long> visited, vector<int>& source, vector<int>& target) {
        int cnt = 0;
        int N = 1e6;
        queue<vector<int>> q;
        q.push(source);
        visited.insert((long)source[0] * N + source[1]);
        while (!q.empty()) {
            auto t = q.front();
            q.pop();
            if (t == target) return true;
            for (int i = 0; i < 4; ++i) {
                int x = t[0] + dx[i];
                int y = t[1] + dy[i];
                if (x < 0 || x >= N || y < 0 || y >= N || visited.count((long) x * N + y)) continue;
                visited.insert((long) x * N + y);
                q.push({x, y});
                if (++cnt == 20000) return true;
            }
        }
        return false;
    }
};