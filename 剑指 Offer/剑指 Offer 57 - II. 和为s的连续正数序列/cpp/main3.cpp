class Solution {
public:
    vector<vector<int>> findContinuousSequence(int target) {
    	vector<vector<int>> res;
    	int left = 1, right = 2;
        while (left < right) {
            int sum = (left + right) * (right - left + 1) / 2;
            if (sum == target) {
                vector<int> temp;
                for (int i = left; i <= right; ++i) {
                    temp.push_back(i);
                }
                res.push_back(temp);
                ++left;
            }
            else if (sum < target) {
                ++right;
            }
            else {
                ++left;
            }
        }
    	return res;
    }
};