class Solution
{
    int p[200005], ne[200005], h[100005], m = 0, flag = 0;
    set<int> visit;

public:
    void dfs(int x, int target)
    {
        if (visit.end() != visit.find(x))
            return;
        visit.insert(x);
        if (x == target)
            flag = 1;
        for (int i = h[x]; i; i = ne[i])
        {
            dfs(p[i], target);
        }
    }
    bool findWhetherExistsPath(int n, vector<vector<int>> &graph, int start, int target)
    {
        for (auto e : graph)
        {
            p[++m] = e[1];
            ne[m] = h[e[0]];
            h[e[0]] = m;
            p[++m] = e[1];
            ne[m] = h[e[1]];
            h[e[1]] = m;
        }
        dfs(start, target);
        return flag;
    }
};