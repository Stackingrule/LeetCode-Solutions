class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    	unordered_map<int, int> map;
    	vector<int> result;
    	for (int i = 0; i < nums.size(); i++) {
    		if (map.find(nums[i]) == map.end()) {
    			map[target - nums[i]] = i;
    		}
    		else {
    			result.push_back(map[nums[i]]);
    			result.push_back(i);
    			break;
    		}
    	}
    	return result;
    }
};