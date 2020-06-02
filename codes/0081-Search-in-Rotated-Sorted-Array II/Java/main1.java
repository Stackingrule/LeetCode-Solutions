class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length, left = 0, right = n - 1;
        while (left <= right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] == target) return true;
        	if (nums[mid] < nums[right]) {
        		if (nums[mid] < target && target <= nums[right]) left = mid + 1;
        		else right = mid - 1;
        	}
        	else if (nums[mid] > nums[right]) {
        		if (nums[left] <= target && nums[mid] > target) right = mid - 1;
        		else left = mid + 1;
        	}
        	else --right;
        }
        return false;
    }
}