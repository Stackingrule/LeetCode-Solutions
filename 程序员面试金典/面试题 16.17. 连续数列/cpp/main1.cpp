class Solution {
public:
    int maxSubArray(vector<int>& nums) {
    	if (nums.size() == 0) return INT_MIN;
    	int maxSum = nums[0];
    	for (int i = 1; i < nums.size(); ++i) {
    		if (nums[i - 1] > 0)
    			nums[i] += nums[i - 1];
    		maxSum = max(maxSum, nums[i]);
    	}
    	return maxSum;
    }
};