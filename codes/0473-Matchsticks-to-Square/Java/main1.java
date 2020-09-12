class Solution {
    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length < 4) return false;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 4 != 0) return false;
        int[] sums = new int[4];
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            ++i;
            --j;
        }
        return helper(nums, sums, 0, sum / 4);
    }

    public boolean helper(int[] nums, int[] sums, int pos, int target) {
        if (pos >= nums.length) {
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }
        for (int i = 0; i < 4; ++i) {
            if (sums[i] + nums[pos] > target) continue;
            sums[i] += nums[pos];
            if (helper(nums, sums, pos + 1, target)) return true;
            sums[i] -= nums[pos];
        }
        return false;
    }
}