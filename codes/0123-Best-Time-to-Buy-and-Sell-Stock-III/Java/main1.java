class Solution {
    public int maxProfit(int[] prices) {
        int[] g = new int[3];
        int[] l = new int[3];
        Arrays.fill(g, 0);
        Arrays.fill(l, 0);
        for (int i = 0; i < prices.length - 1; ++i) {
        	int diff = prices[i + 1] - prices[i];
        	for (int j = 2; j >= 1; --j) {
        		l[j] = Math.max(g[j - 1] + Math.max(diff, 0), l[j] + diff);
        		g[j] = Math.max(l[j], g[j]);
        	}
        }
        return g[2];
    }
}