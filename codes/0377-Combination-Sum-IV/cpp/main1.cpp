class Solution {
public:
    int combinationSum4(vector<int>& nums, int target) {
    	const int MOD = INT_MAX;
        vector<unsigned> dp(target + 1, 0);
        dp[0] = 1;
        for (int i = 1; i <= target; ++i) {
        	for (int num : nums) {
        		if (i - num >= 0) {
        			dp[i] = (dp[i] + dp[i - num]) % MOD;
        		}
        	}
        }
        return dp[target];
    }
};