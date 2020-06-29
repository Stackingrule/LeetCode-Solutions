class Solution {
public:
    int majorityElement(vector<int>& nums) {
    	int n = nums.size();
        int times = 0;
        if (n % 2 == 0) {
            times = n / 2;
        }
        else {
            times = n / 2 + 1;
        }
    	unordered_map<int, int> map;
    	for (int num : nums) {
    		++map[num];
    	}
    	for (auto a : map) {
    		if (a.second >= times) {
    			return a.first;
    		}
    	}
    	return 0;
    }
};