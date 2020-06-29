class Solution {
public:
    vector<int> singleNumbers(vector<int>& nums) {
    	vector<int> res;
    	unordered_map<int, int> map;
    	for (int num : nums) {
    		++map[num];
    	}
    	for (auto a : map) {
    		if (a.second == 1) {
    			res.push_back(a.first);
    		}
    	}
    	return res;
    }
};