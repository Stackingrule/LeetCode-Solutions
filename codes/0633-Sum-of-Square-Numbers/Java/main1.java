class Solution {
    public boolean judgeSquareSum(int c) {
        int b = (int)Math.sqrt(c / 2);
        for (int a = 0; a <= b; a++) {
            int n = c - a * a;
            if (((int)Math.sqrt(n) * (int)Math.sqrt(n)) == n) return true;
        }
        return false;
    }
}