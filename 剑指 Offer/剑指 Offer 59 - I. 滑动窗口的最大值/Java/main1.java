class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k) {
            return new int[0];
        }

        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = nums[i];
            for (int j = i + 1; j < i + k; j++) {
                if (max < nums[j]) {
                    max = nums[j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}