class Solution {
    public int lastRemaining(int n) {
        return hepler(n, true);
    }

    private int hepler(int n, boolean left2right) {
        if (n == 1) return 1;
        if (left2right) {
            return 2 * hepler(n / 2, false);
        } else {
            return 2 * hepler(n / 2, true) - 1 + n % 2;
        }
    }
}