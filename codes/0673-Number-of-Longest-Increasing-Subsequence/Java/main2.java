class Solution {
    public int findNumberOfLIS(int[] nums) {
        int res = 0, mx = 0, n = nums.length;
        int[] cnt = new int[n];
        int[] len = new int[n];
        Arrays.fill(cnt, 1);
        Arrays.fill(len, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] <= nums[j]) continue;
                if (len[i] == len[j] + 1) cnt[i] += cnt[j];
                else if (len[i] < len[j] + 1) {
                    len[i] = len[j] + 1;
                    cnt[i] = cnt[j];
                }
            }
            mx = Math.max(mx, len[i]);
        }
        for (int i = 0; i < n; ++i) {
            if (mx == len[i]) res += cnt[i];
        }
        return res;
    }
}