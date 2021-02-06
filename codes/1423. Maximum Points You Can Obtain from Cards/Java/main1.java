class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += cardPoints[i];
        }
        int maxVal = sum;
        int end = n;
        int tail = 0;
        for (int i = k - 1; i >= 0; --i) {
            sum -= cardPoints[i];
            tail += cardPoints[--end];

            maxVal = Math.max(maxVal, sum + tail);
        }

        return maxVal;
    }
}