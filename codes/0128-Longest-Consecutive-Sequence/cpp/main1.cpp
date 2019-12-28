// Time Limit Exceeded	
class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
    	unordered_set<int> my_set;
    	for(auto i : nums) my_set.insert(i);
		int longet = 0;

		for(auto i : nums) {
			int length =  1;
			for(int j = i - 1; my_set.find(i) != my_set.end(); --j) {
				my_set.erase(j);
				++length;
			}
			for(int j = i + 1; my_set.find(i) != my_set.end(); ++j) {
				my_set.erase(j);
				++length;
			}
			longet = max(longet, length);
		}
		return longet;
    }
};
