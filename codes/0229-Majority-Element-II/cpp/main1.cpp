class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
    	vector<int> res;
        const int n = nums.size();
        unordered_map<int, int> map;
        for (int num : nums) {
        	++map[num];
        }
        for (auto m : map) {
        	if (m.second > n / 3) {
        		res.push_back(m.first);
        	}
        }
        return res;
    }
};