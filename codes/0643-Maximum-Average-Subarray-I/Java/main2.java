class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double res = 0, sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }
        for (int i = k; i < n; ++i) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;
    }
}