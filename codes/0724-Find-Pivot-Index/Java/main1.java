class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int curSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (sum - nums[i] == curSum * 2) {
                return i;
            } else {
                curSum += nums[i];
            }
        }
        return -1;
    }
}