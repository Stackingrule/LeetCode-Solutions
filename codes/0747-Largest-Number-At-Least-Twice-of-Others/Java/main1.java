class Solution {
    public int dominantIndex(int[] nums) {
        int mx = Integer.MIN_VALUE, mxId  = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (mx < nums[i]) {
                mx = nums[i];
                mxId = i;
            }
        }
        for (int num : nums) {
            if (mx != num && mx - num < num) return -1;
        }
        return mxId;
    }
}