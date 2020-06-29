class Solution {
public:
    bool isStraight(vector<int>& nums) {
    	sort(nums.begin(), nums.end());
    	int i = 0, zero = 0;
    	for (i = 0; i < 4; ++i) {
    		if (nums[i] == 0) ++zero;
    		else {
    			if (nums[i] == nums[i + 1]) return false;
    		}
    	}
    	if (zero == 0) return nums[4] - nums[0] == 4;
    	else return nums[4] - nums[zero] <= 4;
    }
};