class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        int res = 0, n = timeSeries.length;
        for (int i = 1; i < n; ++i) {
        	int diff = timeSeries[i] - timeSeries[i - 1];
        	res += (diff < duration) ? diff : duration;
        }
        return res + duration;
    }
}