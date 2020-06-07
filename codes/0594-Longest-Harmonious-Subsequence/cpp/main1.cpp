class Solution {
public:
    int findLHS(vector<int>& nums) {
        int res = 0;
        unordered_map<int, int> map;
        for (int num : nums) ++map[num];
    	for (auto m : map) {
    		if (map.count(m.first + 1)) {
    			res = max(res, map[m.first] + map[m.first + 1]);
    		}
    	}
    	return res;
    }
};