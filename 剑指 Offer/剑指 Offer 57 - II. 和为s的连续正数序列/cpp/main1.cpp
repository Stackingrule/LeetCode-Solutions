/**
* 时间复杂度：O(n^2)
* 空间复杂度：O(1)
*/
class Solution {
public:
    vector<vector<int>> findContinuousSequence(int target) {
    	vector<vector<int>> res;
    	for (int i = 1; i <= target / 2; ++i) {
    		vector<int> tmp;
    		int sum = i;
            tmp.push_back(i);
    		for (int j = i + 1; j <= target / 2 + 1; ++j) {
    			sum += j;
    			tmp.push_back(j);
    			if (sum == target) {
    				res.push_back(tmp);
    				break;
    			}
    			else if (sum > target) {
    				break;
    			}
    		}
    	}
    	return res;
    }
};