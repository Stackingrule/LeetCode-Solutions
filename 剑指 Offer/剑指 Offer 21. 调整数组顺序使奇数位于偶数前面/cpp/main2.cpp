class Solution {
public:
    vector<int> exchange(vector<int>& nums) {
    	int n = nums.size();
    	int left = 0, right = n - 1;
    	while (left < right) {
            while (nums[left] % 2 == 1) left++;
            while (nums[right] % 2 == 0) right--;
            if (left < right) swap(nums[left], nums[right]);
        }
        return nums;
    }
};