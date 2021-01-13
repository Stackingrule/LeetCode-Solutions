class Solution
{
public:
    vector<int> findRedundantConnection(vector<vector<int>> &edges)
    {
        unordered_map<int, unordered_set<int>> m;
        for (auto edge : edges)
        {
            queue<int> q{{edge[0]}};
            unordered_set<int> s{{edge[0]}};
            while (!q.empty())
            {
                auto t = q.front();
                q.pop();
                if (m[t].count(edge[1]))
                    return edge;
                for (int num : m[t])
                {
                    if (s.count(num))
                        continue;
                    q.push(num);
                    s.insert(num);
                }
            }
            m[edge[0]].insert(edge[1]);
            m[edge[1]].insert(edge[0]);
        }
        return {};
    }
};