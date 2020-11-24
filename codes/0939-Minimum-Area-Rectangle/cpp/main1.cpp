class Solution
{
public:
    int minAreaRect(vector<vector<int>> &points)
    {
        int res = INT_MAX, n = points.size();
        unordered_map<int, unordered_set<int>> m;
        for (auto point : points)
        {
            m[point[0]].insert(point[1]);
        }
        for (int i = 0; i < n; ++i)
        {
            for (int j = i + 1; j < n; ++j)
            {
                if (points[i][0] == points[j][0] || points[i][1] == points[j][1])
                    continue;
                if (m[points[i][0]].count(points[j][1]) && m[points[j][0]].count(points[i][1]))
                {
                    res = min(res, abs(points[i][0] - points[j][0]) * abs(points[i][1] - points[j][1]));
                }
            }
        }
        return res == INT_MAX ? 0 : res;
    }
};