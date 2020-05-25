class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length, mn = Integer.MAX_VALUE;
        for (int j = 0; j < n; ++j) {
        	mn = Math.min(mn, nums[j]);
        	if (mn == nums[j]) continue;
        	for (int k = n - 1; k > j; --k) {
        		if (mn < nums[k] && nums[j] > nums[k]) return true;
        	}
        }
        return false;
    }
}