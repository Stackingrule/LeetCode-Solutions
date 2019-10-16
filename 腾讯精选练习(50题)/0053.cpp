class Solution {

public:
    int maxSubArray(vector<int>& nums) {
    	if(nums.size() == 0)
    		return 0;
    	int maxNum = nums[0];
    	int cur = 0;
    	for(int i = 0; i < nums.size(); i++) {
    		cur += nums[i];
    		maxNum = max(maxNum, cur);
    		cur = cur < 0 ? 0 : cur;
    	}
    	return maxNum;
    }
}; 