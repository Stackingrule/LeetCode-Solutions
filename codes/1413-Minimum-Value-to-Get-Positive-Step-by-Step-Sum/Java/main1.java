class Solution {
    public int minStartValue(int[] nums) {
        int s = 0, m = 1;
        for (int num : nums) {
            s -= num;
            m = Math.max(m, s + 1);
        }
        return m;
    }
}