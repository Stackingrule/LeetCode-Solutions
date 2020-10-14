class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] f = new int[n + 1];
        int[] g = new int[n + 1];
        f[0] = 0;
        g[0] = -1000000000;

        for (int i = 1; i <= n; ++i) {
            f[i] = Math.max(f[i - 1], g[i - 1] + prices[i - 1] - fee);
            g[i] = Math.max(g[i - 1], f[i - 1] - prices[i - 1]);
        }
        return f[n];
    }
}