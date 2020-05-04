class Solution {

	private int res;

    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num : nums) {
        	sum += num;
        }
        if (sum < Math.abs(S)) return 0;
        res = 0;
        dfs(nums, 0, S);
        return res;
    }

    private void dfs(int[] nums, int d, int S) {
    	if (d == nums.length) {
    		if (S == 0) ++res;
    		return;
    	}
    	dfs(nums, d + 1, S - nums[d]);
    	dfs(nums, d + 1, S + nums[d]);
    }
}