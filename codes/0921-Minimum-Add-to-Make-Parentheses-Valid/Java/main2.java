class Solution {
    public int minAddToMakeValid(String S) {
        int ans = 0, cnt = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                if (cnt < 0) {
                    ans += Math.abs(cnt);
                    cnt = 0;
                }
                ++cnt;
            } else {
                --cnt;
            }
        }
        return ans + Math.abs(cnt);
    }
}