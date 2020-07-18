class Solution {
public:
    int smallestDifference(vector<int>& a, vector<int>& b) {
    	sort(a.begin(), a.end());
    	sort(b.begin(), b.end());
    	long res = INT_MAX;
    	for (int i = 0, j = 0; i < a.size() && j < b.size(); ) {
    		res = min(res, abs(long(a[i]) - long(b[j])));
    		if (a[i] < b[j]) {
    			i++;
    		}
    		else {
    			j++;
    		}
    	}
    	return res;
    }
};