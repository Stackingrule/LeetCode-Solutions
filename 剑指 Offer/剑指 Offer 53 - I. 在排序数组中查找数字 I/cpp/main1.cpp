class Solution {
public:
    int search(vector<int>& nums, int target) {
    	unordered_map<int, int> map;
    	for (int num : nums) {
    		++map[num];
    	}
    	return map[target];
    }
};