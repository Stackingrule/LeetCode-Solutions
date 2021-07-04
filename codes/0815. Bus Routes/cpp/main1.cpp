class Solution {
public:
    int numBusesToDestination(vector<vector<int>>& routes, int source, int target) {
        if (source == target) return 0;

        unordered_map<int, vector<int> > m;
        for (int i = 0; i < routes.size(); ++i) {
            for (const int stop : routes[i]) {
                m[stop].push_back(i);
            }
        }

        vector<int> visited(routes.size(), 0);
        queue<int> q;
        q.push(source);
        int buses = 0;

        while (!q.empty()) {
            int size = q.size();
            ++buses;
            while (size--) {
                int cur = q.front(); q.pop();
                for (const int bus : m[cur]) {
                    if (visited[bus]) continue;
                    visited[bus] = 1;
                    for (int stop : routes[bus]) {
                        if (stop == target) return buses;
                        q.push(stop);
                    }
                }
            }
        }

        return -1;
    }
};