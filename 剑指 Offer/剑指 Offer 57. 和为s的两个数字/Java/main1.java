class Solution {
    public int[] twoSum(int[] nums, int target) {
    	if (nums == null || nums.length == 0) {
    		return new int[] {};
    	}
    	int i = 0, j = nums.length - 1;
    	while (i < j) {
    		int sum = nums[i] + nums[j];
    		if (sum == target) {
    			return new int[] {nums[i], nums[j]};
    		}
    		else if (sum < target) ++i;
    		else --j;
    	}
    	return new int[] {};
    }
}