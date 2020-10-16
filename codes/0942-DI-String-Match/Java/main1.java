class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] res = new int[n + 1];
        int lo = 0, hi = n;
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == 'I') {
                res[i] = lo++;
            } else {
                res[i] = hi--;
            }
        }
        res[n] = hi;
        return res;
    }
}