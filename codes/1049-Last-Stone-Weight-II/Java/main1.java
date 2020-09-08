class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length, sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int i = 0; i < n; ++i) {
            for (int j = sum / 2; j >= stones[i]; --j) {
                dp[j] = dp[j] || dp[j - stones[i]];
            }
        }
        for (int i = sum / 2; i >= 0; --i) {
            if (dp[i]) {
                return sum - i - i;
            }
        }
        return sum;
    }
}