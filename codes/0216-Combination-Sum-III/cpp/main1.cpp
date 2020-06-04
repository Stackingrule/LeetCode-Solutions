class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<int> cur;
        vector<vector<int>> res;
        dfs(k, n, 1, cur, res);
        return res;
    }

private:
	void dfs(int k, int n, int s, vector<int> &cur, vector<vector<int>> &res) {
		if (k == 0) {
			if (n == 0) {
				res.push_back(cur);
				return;
			}
		}
		for (int i = s; i <= 9; ++i) {
			if (i > n) return;
			cur.push_back(i);
			dfs(k - 1, n - i, i + 1, cur, res);
			cur.pop_back();
		}
	}
};