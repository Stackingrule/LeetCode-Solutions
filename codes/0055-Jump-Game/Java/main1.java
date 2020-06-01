/**
* 动态规划
*/
class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);
        for (int i = 1; i < nums.length; ++i) {
        	dp[i] = Math.max(dp[i - 1], nums[i - 1]) - 1;
        	if (dp[i] < 0) return false;
        }
        return true;
    }
}