/**
* 相对位置改变
*/
class Solution {
public:
    vector<int> exchange(vector<int>& nums) {
    	int n = nums.size();
    	vector<int> res(n);
    	int left = 0, right = n - 1;
    	for (int i = 0; i < n; ++i) {
    		if (nums[i] % 2 == 0) {
    			res[right--] = nums[i];
    		}
    		else {
    			res[left++] = nums[i];
    		}
    	}
    	return res;
    }
};