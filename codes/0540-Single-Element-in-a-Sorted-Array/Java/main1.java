class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1, n = nums.length;
        while (left < right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] == nums[mid + 1]) {
        		if ((n - 1 - mid) % 2 == 1) right = mid;
        		else left = mid + 1;
        	} else {
        		if (mid == 0 || nums[mid] != nums[mid - 1]) return nums[mid];
        		if ((n - 1 - mid) % 2 == 0) right = mid;
        		else left = mid + 1;
        	}
        }
        return nums[left];
    }
}