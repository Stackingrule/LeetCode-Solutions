class Solution {
public:
    int findRepeatNumber(vector<int>& nums) {
    	set<int> set;
    	for (auto num : nums) {
    		if (set.count(num)) {
    			return num;
    		}
    		set.insert(num);
    	}

    	return -1;
    }
};