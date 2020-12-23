class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0)
            return 0;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int mx = 0;
        for (int i = 0; i <= n; ++i) {
            if (nums[i] > mx) {
                mx = nums[i];
            }
            if (2 * i >= 2 && 2 * i <= n) {
                nums[2 * i] = nums[i];
            }
            if (2 * i + 1 >= 2 && 2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
        }
        return mx;
    }
}