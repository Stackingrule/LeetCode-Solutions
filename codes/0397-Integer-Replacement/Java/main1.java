class Solution {
    public int integerReplacement(int n) {
        int count = 1;
        if (n == 1) {
            return 0;
        } else if (n == 2147483647) {
            return 32;
        } else {
            if (n % 2 == 0) {
                count += integerReplacement(n / 2);
            } else {
                count += min(integerReplacement(n - 1), integerReplacement(n + 1));
            }
        }
        return count;
    }
    private int min(int n1, int n2) {
        return n1 <= n2 ? n1 : n2;
    }

}