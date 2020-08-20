class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0, cnt = 0, cur = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > cur) cnt++;
            else cnt = 1;
            res = Math.max(res, cnt);
            cur = num;
        }
        return res;
    }
}