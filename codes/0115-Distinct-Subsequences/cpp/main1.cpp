/*
* 递推一个二维的 dp 数组，其中 dp[i][j] 表示s中范围是 [0, i] 的子串中能组成t中范围是 [0, j] 的子串的子序列的个数
* dp[i][j] = dp[i][j - 1] + (T[i - 1] == S[j - 1] ? dp[i - 1][j - 1] : 0)
*/
class Solution {
public:
    int numDistinct(string s, string t) {
        int m = s.size(), n = t.size();
        vector<vector<long>> dp(n + 1, vector<long>(m + 1));
        for (int j = 0; j <= m; ++i) dp[0][j] = 1;
    	for (int i = 1; i <= n; ++i) {
    		for (int j = 1; j <= m; ++j) {
    			dp[i][j] = dp[i][j - 1] + (t[i - 1] == s[j - 1] ? dp[i - 1][j - 1] : 0);
    		}
    	}
    	return dp[n][m];
    }
};