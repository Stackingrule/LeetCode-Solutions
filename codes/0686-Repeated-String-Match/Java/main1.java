class Solution {
    public int repeatedStringMatch(String a, String b) {
        int m = a.length(), n = b.length();
        for (int i = 0; i < m; ++i) {
            int j = 0;
            while (j < n && a.charAt((i + j) % m) == b.charAt(j)) ++j;
            if (j == n) return (i + j - 1) / m + 1;
        }
        return -1;
    }
}