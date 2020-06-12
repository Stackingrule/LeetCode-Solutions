class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n -= len * count;
            count *= 10;
            start *= 10;
            len++;
        }
        start += (n - 1) / len;
        return Integer.toString(start).charAt((n - 1) % len) - '0';
    }
}