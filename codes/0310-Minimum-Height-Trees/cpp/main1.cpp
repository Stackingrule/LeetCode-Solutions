// O(n) time and O(n) Using BFS 
class Solution {
public:
    vector<int> findMinHeightTrees(int n, vector<vector<int>>& edges) {
        if (n == 1) return {0};
        vector<unordered_set<int>> adj(n);
        vector<int> degree(n, 0);
        for (int i = 0; i < edges.size(); ++i) {
        	adj[edges[i][0]].insert(edges[i][1]);
        	adj[edges[i][1]].insert(edges[i][0]);
        	degree[edges[i][0]]++;
        	degree[edges[i][1]]++;
        }
        int nodecount = n;
        while (nodecount > 2) {
        	queue<int> q;
        	for (int i = 0; i < n; ++i) {
        		if (degree[i] == 1) {
        			q.push(i);
        			degree[i] = -1;
        		}
        	}
        	while (!q.empty()) {
        		int node = q.front();
        		q.pop(); nodecount--;
        		for (int neibhbor : adj[node]) {
        			degree[neibhbor]--;
        		}
        	}
        }
        vector<int> res;
        for (int i = 0; i < n; ++i) {
        	if (degree[i] == 1 || degree[i] == 0) res.push_back(i);
        }

        return res;
    }
};