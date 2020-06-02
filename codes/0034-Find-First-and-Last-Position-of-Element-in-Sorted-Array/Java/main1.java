class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
        	return new int[] { -1, -1 };
        }

        int[] res = new int[2];
        Arrays.fill(res, -1);
        int left = 0, right = nums.length;
        while (left < right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] < target) left = mid + 1;
        	else right = mid;
        }
        if (right == nums.length || nums[right] != target) return res;

        res[0] = right;

        right = nums.length;
        while (left < right) {
        	int mid = left + (right - left) / 2;
        	if (nums[mid] <= target) left = mid + 1;
        	else right = mid;
        }

        res[1] = right - 1;

        return res;
    }
}