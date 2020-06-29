class Solution {
public:
    vector<vector<int>> findContinuousSequence(int target) {
    	vector<vector<int>> res;
    	for (int i = 1; i <= target / 2; ++i) {
    		int sum = i;
            for (int j = i + 1; j <= target / 2 + 1; ++j) {
                sum += j;
                if (sum == target) {
                    vector<int> temp;
                    for (int k = i; k <= j; ++k) {
                        temp.push_back(k);
                    }
                    res.push_back(temp);
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