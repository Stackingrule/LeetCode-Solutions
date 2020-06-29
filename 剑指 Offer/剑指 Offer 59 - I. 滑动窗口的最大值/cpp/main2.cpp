class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
    	vector<int> res(nums.size() - k + 1);
    	if (nums.size() == 0 || nums.size() < k || k < 1) {
    		return {};
    	}
    	for (int i = 0; i < nums.size() - k + 1; ++i) {
    		int max = nums[i];
    		for (int j = i + 1; j < i + k; ++j) {
    			if (max < nums[j]) {
    				max = nums[j];
    			}
    		}
    		res[i] = max;
    	}
    	return res;
    }
};