class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double[] sums = new double[n];
        sums[0] = (double) nums[0];
        for (int i = 1; i < n; ++i) {
            sums[i] = sums[i - 1] + nums[i];
        }
        double max = sums[k - 1];
        for (int i = k; i < n; ++i) {
            max = Math.max(max, sums[i] - sums[i - k]);
        }
        return max / k;
    }
}