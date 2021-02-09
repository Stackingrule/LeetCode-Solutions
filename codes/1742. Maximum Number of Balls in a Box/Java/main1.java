class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] balls = new int[46];
        int ans = 0;
        for (int i = lowLimit; i <= highLimit; ++i) {
            int n = i;
            int box = 0;
            while (n >= 1) {
                box += n % 10;
                n /= 10;
            }
            ans = Math.max(ans, ++balls[box]);
        }
        return ans;
    }
}