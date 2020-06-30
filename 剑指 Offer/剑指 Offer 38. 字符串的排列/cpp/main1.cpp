class Solution {
public:
    vector<string> permutation(string s) {
    	if (s.empty()) return {};
    	int n = s.size();
    	vector<string> res;
    	vector<bool> visited(n, false);
    	string cur = "";
    	sort(s.begin(), s.end());
    	dfs(res, visited, cur, s);
    	return res;
    }

    void dfs(vector<string> &res, vector<bool> visited, string cur, string s) {
    	if (cur.size() == s.size()) {
    		res.push_back(cur);
    		return;
    	}
    	int last_i = -1;
    	for (int i = 0; i < visited.size(); ++i) {
    		if (visited[i]) continue;
    		else if (last_i == -1 or s[i] != s[last_i]) {
    			visited[i] = true;
    			cur.push_back(s[i]);
    			dfs(res, visited, cur, s);
    			cur.pop_back();
    			visited[i] = false;
    			last_i = i;
    		}
    	}
    }
};