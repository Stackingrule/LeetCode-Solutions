class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        int res = 0, sum = 0;
        for (int i = 0; i < 32; ++i)
        {
            int binary = (N >> i) & 1;
            sum += (binary << i);
            if (sum >= N) break;
            int complete = 1 - binary;
            res += (complete << i);
        }
        return res;
    }
}