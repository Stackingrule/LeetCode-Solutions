class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        for (int i = k - 1; i < nums.length; ++i) {
        	int maxNum = nums[i];
        	for (int j = 1; j < k; ++j) {
        		if (nums[i - j] > maxNum) maxNum = nums[i - j];
        	}
        	res[i - k + 1] = maxNum;
        }
        return res;
    }
}