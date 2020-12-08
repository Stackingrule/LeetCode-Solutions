class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] c = new int[60];
        int ans = 0;
        for (int t : time) {
            t %= 60;
            ans += c[(60 - t) % 60];
            ++c[t];
        }
        return ans;
    }
}