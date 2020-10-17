class Solution
{
public:
    int dx[4] = {0, 1, 0, -1};
    int dy[4] = {1, 0, -1, 0};
    int bfs(const pair<int, int> &S, const pair<int, int> &T,
            int n, int m, const vector<vector<int>> &forest)
    {

        vector<vector<int>> dis(n, vector<int>(m, -1));
        queue<pair<int, int>> q;
        dis[S.first][S.second] = 0;
        q.push(S);

        while (!q.empty())
        {
            pair<int, int> sta = q.front();
            q.pop();
            if (sta.first == T.first && sta.second == T.second)
                return dis[T.first][T.second];
            for (int i = 0; i < 4; i++)
            {
                int tx = sta.first + dx[i], ty = sta.second + dy[i];
                if (tx < 0 || tx >= n || ty < 0 || ty >= m || forest[tx][ty] == 0)
                    continue;
                if (dis[tx][ty] == -1)
                {
                    dis[tx][ty] = dis[sta.first][sta.second] + 1;
                    q.push(make_pair(tx, ty));
                }
            }
        }

        return -1;
    }

    int cutOffTree(vector<vector<int>> &forest)
    {
        int n = forest.size(), m = forest[0].size();
        vector<pair<int, pair<int, int>>> trees;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (forest[i][j] > 1)
                    trees.push_back(make_pair(forest[i][j], make_pair(i, j)));

        trees.push_back(make_pair(0, make_pair(0, 0)));

        sort(trees.begin(), trees.end());

        int t = trees.size(), ans = 0;

        for (int i = 1; i < t; i++)
        {
            int d = bfs(trees[i - 1].second, trees[i].second, n, m, forest);
            if (d == -1)
                return -1;
            ans += d;
        }
        return ans;
    }
};