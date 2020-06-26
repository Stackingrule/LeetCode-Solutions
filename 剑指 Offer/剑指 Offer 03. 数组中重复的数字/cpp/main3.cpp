/**
* 原地置换
*/
class Solution {
public:
    int findRepeatNumber(vector<int>& nums) {
    	int n = nums.size();
        for (int i = 0; i < n; ++i) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}; 