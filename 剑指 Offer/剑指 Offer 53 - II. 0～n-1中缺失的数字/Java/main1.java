class Solution {
    public int missingNumber(int[] nums) {
    	if (nums == null || nums.length == 0) return 0;
    	int left = 0, right = nums.length;
    	while (left < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] == mid) left = mid + 1;
    		else right = mid;
    	}
    	return right;
    }
}