class Solution {
public:
    int maxSubArray(vector<int>& nums) {
    	int n = nums.size();
    	int dp[n];
    	int ans = 0;
    	int l = 0, r = 0;
    	dp[0] = nums[0];
    	for(int i = 1; i < n - 1; i++) {
    		dp[i] = max(dp[i-1]+nums[i], nums[i]);
    		if(dp[i] < 0)
    			l = i + 1;
    		if(ans < dp[i]) {
    			ans = dp[i];
    			r = i;
    		}
    	}
    	return ans;
        
    }
};