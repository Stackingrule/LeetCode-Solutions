class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        vector<string> res;
        unordered_map<string, int> map;
        int mn = INT_MAX, n1 = list1.size(), n2 = list2.size();
        for (int i = 0; i < n1; ++i) map[list1[i]] = i;
    	for (int i = 0; i < n2; ++i) {
    		if (map.count(list2[i])) {
    			int sum = i + map[list2[i]];
    			if (sum == mn) res.push_back(list2[i]);
    			else if (sum < mn) {
    				mn = sum;
    				res = {list2[i]};
    			}
    		}
    	}
    	return res;
    }
};