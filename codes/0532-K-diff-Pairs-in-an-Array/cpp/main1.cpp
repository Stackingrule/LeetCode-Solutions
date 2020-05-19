class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int res = 0, n = nums.size();
        unordered_map<int, int> map;
        for (int num : nums) ++map[num];
    	for (auto m : map) {
    		if (k == 0 && m.second > 1) ++res;
    		if (k > 0 && map.count(m.first + k)) ++res;
    	}
    	return res;
    }
};