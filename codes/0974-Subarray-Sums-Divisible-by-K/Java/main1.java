class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int[] c = new int[K];
        c[0] = 1;
        int res = 0;
        int sum = 0;
        for (int a : A) {
            sum = (sum + a % K + K) % K;
            res += c[sum]++;
        }
        return res;
    }
}