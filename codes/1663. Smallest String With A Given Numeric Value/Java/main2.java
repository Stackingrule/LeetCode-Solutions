class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int count = n - 1;
        for (int i = 0; i < n; i++) {
            if (k - count * 26 <= 0) {
                sb.append('a');
                k -= 1;
            } else {
                sb.append((char) ('a' + k - count * 26 - 1));
                k = count * 26;
            }
            count -= 1;
        }
        return sb.toString();
    }
}