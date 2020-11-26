class Solution {
    public int maximumGap(int[] nums) {
        int maxGap = 0;
        int n = nums.length;
        if (n < 2) return 0;

        Arrays.sort(nums);

        for (int i = 1; i < n; ++i) {
            if (Math.abs(nums[i - 1] - nums[i]) > maxGap) {
                maxGap = Math.abs(nums[i - 1] - nums[i]);
            }
        }

        return maxGap;
    }
}