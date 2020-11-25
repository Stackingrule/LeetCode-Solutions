class Solution {
    public int smallestRepunitDivByK(int K) {
        int value = 1;
        int len = 1;
        while(len <= K) {
            if(value%K == 0) {
                return len;
            }
            value = (value * 10 + 1)%K;
            len++;
        }
        return -1;
    }
}