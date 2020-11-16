class Solution {

    int mod = 1000000007;

    public int waysToStep(int n) {
        long[] f = {1, 0, 0, 0};
        for (int i = 0; i < n; ++i) {
            f[3] = f[2];
            f[2] = f[1];
            f[1] = f[0];
            f[0] = (f[1] + f[2] + f[3]) % mod;
        }
        return (int)f[0];
    }
}
