class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        if (values == null || values.length == 0)
            return 0;
        int ans = 0;
        int maxI = values[0] + 0;
        for (int j = 1; j < values.length; ++j) {
            ans = Math.max(ans, maxI + values[j] - j);
            maxI = Math.max(maxI, values[j] + j);
        }
        return ans;
    }
}