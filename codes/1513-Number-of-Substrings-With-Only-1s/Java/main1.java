class Solution {
    public int numSub(String s) {
        final int kMod = 1_000_000_000 + 7;
        int ans = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            cur = s.charAt(i) == '1' ? cur + 1 : 0;
            ans = (ans + cur) % kMod;
        }
        return ans;
    }
}