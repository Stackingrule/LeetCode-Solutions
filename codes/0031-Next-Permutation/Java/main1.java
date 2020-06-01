class Solution {
    public void nextPermutation(int[] nums) {
        int i, j;
        for (i = nums.length - 2; i >= 0; --i) {
        	if (nums[i] < nums[i + 1]) break;
        }
        if (i >= 0) {
        	for (j = nums.length - 1; j >= i; --j) {
        		if (nums[j] > nums[i]) break;
        	}
        	swap(nums, i, j);
        	Arrays.sort(nums, i + 1, nums.length);
        }
        else {
        	Arrays.sort(nums);
        }
    }

    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}