class Solution {
    public int numPrimeArrangements(int n) {
        int count = 0;//记录质数个数
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        long res = 1;
        int tmp = 1000000007;
        //求质数个数的阶乘对1000000007取模的值
        for (int i = count; i >= 2; i--) {
            res = (res * i) % tmp;
        }
        //求非质数个数的阶乘和上一段代码值乘积对1000000007取模的值
        for (int i = n - count; i >= 2; i--) {
            res = (res * i) % tmp;
        }
        return (int)res;
    }
    //判断是否为质数
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        int t = (int)Math.sqrt(n);
        for (int i = 2; i <= t; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}