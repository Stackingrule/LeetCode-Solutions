class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        // 1. 从数组第二个数开始遍历数组
        for (int i = 1; i < nums.length; ++i) {
            // 2. 判断当前数比前一个数小或者等于不满足单调递增
            if (nums[i] <= nums[i - 1]) {
                // 3. 将当前num[i]操作（nums[i-1]-nums[i]+1）次记录并更新nums[i]
                res += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return res;
    }
}