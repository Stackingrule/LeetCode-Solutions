class Solution {
public:
    int singleNumber(vector<int>& nums) {
    	unordered_map<int, int> map;
    	for (int num : nums) {
    		++map[num];
    	}
    	for (auto a : map) {
    		if (a.second == 1) {
    			return a.first;
    		}
    	}
    	return -1;
    }
};