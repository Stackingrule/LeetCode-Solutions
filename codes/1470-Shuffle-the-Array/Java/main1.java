class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0, j = 0; j < n; i += 2) {
            res[i] = nums[j];
            res[i + 1] = nums[j + n];
            j++;
        }
        return res;
    }
}