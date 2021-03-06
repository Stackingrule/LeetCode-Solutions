/**
* 摩尔投票算法
*/
class Solution {
public:
    int majorityElement(vector<int>& nums) {
    	int count = 1, major = nums[0];
    	for (int i = 1; i < nums.size(); ++i) {
    		if (nums[i] == major) {
    			count++;
    		}
    		else {
    			count--;
    		}
    		if (count == 0) {
    			major = nums[i];
    			count = 1;
    		}
    	}
        // 验证是否满足要求
        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == major) count++;
            if (count == t) return major;
        }
        return -1;
    }
};