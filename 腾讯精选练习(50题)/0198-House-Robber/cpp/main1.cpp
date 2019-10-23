class Solution {
public:
    int rob(vector<int>& nums) {
    	int n = nums.size();

    	if(n == 0)
    		return 0;

    	std::vector<int> memo(n, 0);
    	memo[n - 1] = nums[n - 1];

    	for(int i = n - 2 ; i >= 0 ; i --) {
    		memo[i] = max(memo[i + 1],
                          nums[i] + (i + 2 < n ? memo[i + 2] : 0));
    	}
    	return memo[0];
    }
};