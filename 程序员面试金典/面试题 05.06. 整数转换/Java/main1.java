class Solution {
    public int convertInteger(int A, int B) {
        int n = A ^ B;
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}