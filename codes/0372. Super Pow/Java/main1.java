class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a = a % MOD;
        if (a == 0)
            return a;
        if (b.length == 0)
            return 1;
        int res = powMod(a, b[0]);
        for (int i = 1; i < b.length; i++)
            res = (powMod(res, 10) * powMod(a, b[i])) % MOD;
        return res;
    }

    private int powMod(int a, int b) {
        if (b == 0)
            return 1;
        a = a % MOD;
        int res = a;
        for (int i = 1; i < b; i++)
            res = res * a % MOD;
        return res;
    }
}