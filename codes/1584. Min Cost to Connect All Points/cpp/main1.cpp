// Kruskal’s algorithm 
struct Edge
{
    int cost;
    int x;
    int y;
    bool operator<(const Edge &e) const { return cost < e.cost; }
};
class Solution
{
public:
    int minCostConnectPoints(vector<vector<int>> &points)
    {
        const int n = points.size();
        vector<Edge> edges(n * (n - 1) / 2); // {cost, i, j}
        for (int i = 0, idx = 0; i < n; ++i)
            for (int j = i + 1; j < n; ++j)
                edges[idx++] = {abs(points[i][0] - points[j][0]) +
                                    abs(points[i][1] - points[j][1]),
                                i, j};
        std::sort(begin(edges), end(edges));
        vector<int> p(n);
        std::iota(begin(p), end(p), 0);
        vector<int> rank(n, 0);
        int ans = 0;
        int count = 0;
        for (const auto &e : edges)
        {
            int rx = find(p, e.x);
            int ry = find(p, e.y);
            if (rx == ry)
                continue;
            ans += e.cost;
            if (rank[rx] < rank[ry])
                swap(rx, ry);
            p[rx] = ry;
            rank[ry] += rank[rx] == rank[ry];
            if (++count == n - 1)
                break;
        }
        return ans;
    }

private:
    int find(vector<int> &p, int x) const
    {
        while (p[x] != x)
        {
            int tp = p[x];
            p[x] = p[p[x]];
            x = tp;
        }
        return x;
    }
};