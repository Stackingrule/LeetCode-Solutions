class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int r = -1;
        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                ++cnt;
                r = i;
            }
        }
        if (cnt == 0) return true;
        if (cnt > 1) return false;
        return nums[r] <= nums[0] && nums[r - 1] >= nums[n - 1];
    }
}