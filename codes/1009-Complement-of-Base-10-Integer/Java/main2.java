class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;                
        int exponent = 0;
        int res = 0;
        while (N != 0) {
            if ((N & 1) == 0) {
                res += (1 << exponent);
            }
            exponent++;
            N >>= 1;
        }
        return res;
    }
}