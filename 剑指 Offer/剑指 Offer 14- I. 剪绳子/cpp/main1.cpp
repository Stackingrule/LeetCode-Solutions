class Solution {
public:
    int cuttingRope(int n) {
        if (n == 2) {
        	return 1;
        }

        vector<int> dp(n + 1);
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; ++i) {
        	// 默认初始值就是剪成两段：1 和 i-1，所以最大乘积是 i-1
        	dp[i] = i - 1;
        	for (int j = 1; j <= i / 2; ++j) {
        		int x = max(dp[i - j], i - j);
        		int y = max(dp[j], j);
        		dp[i] = max(x * y, dp[i]);
        	}
        }
        return dp[n];
    }
};