class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }

        // 此处用long，是防止n是Integer.MIN_VALUE时，取反后直接就超过了Integer.MAX_VALUE
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }

        while(b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            // 底数扩大
            x *= x;
            // 指数右移
            b >>= 1;
        }
        return res;
    }
}