class Solution {
public:
    int maxValue(vector<vector<int>>& grid) {
    	if (grid.empty() || grid[0].empty()) {
    		return 0;
    	}
    	int n = grid[0].size();
    	vector<int> dp(n);
    	for (vector<int> g : grid) {
    		dp[0] += g[0];
    		for (int i = 1; i < n; ++i) {
    			dp[i] = max(dp[i], dp[i - 1]) + g[i];
    		}
    	}
    	return dp[n - 1];
    }
};