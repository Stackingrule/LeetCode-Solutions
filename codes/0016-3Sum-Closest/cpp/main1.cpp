class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int closet = nums[0] + nums[1] + nums[2];
        int diff = abs(closet - target);
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size(); ++i) {
        	int left = i + 1, right = nums.size() - 1;
        	while (left < right) {
        		int sum = nums[i] + nums[left] + nums[right];
        		int newDiff = abs(sum - target);
        		if (diff > newDiff) {
        			diff = newDiff;
        			closet = sum;
        		}
        		if (sum < target) ++left;
        		else --right;
        	}
        }
        return closet;
    }
};