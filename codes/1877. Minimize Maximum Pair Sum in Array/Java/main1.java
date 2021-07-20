class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            ans = Math.max(ans, nums[lo] + nums[hi]);
            ++lo;
            --hi;
        }
        return ans;
    }
}