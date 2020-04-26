class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for (int num : nums) {
        	sum += num;
        }

        int res = (int) (0.5 * n * (n + 1) - sum);

        return res;
    }
}