class Solution {
public:
    int maximum(int a, int b) {
        long k = (((long)a - (long)b) >> 63) & 1;
        return b * k + a * (k ^ 1);
    }
};
