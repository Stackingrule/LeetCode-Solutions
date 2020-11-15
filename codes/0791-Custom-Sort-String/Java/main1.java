class Solution {
    public String customSortString(String S, String T) {
        int[] cnt = new int[26];
        for (int i = 0; i < T.length(); ++i) {
            int ch = (int) (T.charAt(i) - 'a');
            cnt[ch]++;
        }
        String ans = "";
        for (int i = 0; i < S.length(); ++i) {
            int ch = (int) (S.charAt(i) - 'a');
            while (cnt[ch] > 0) {
                char c = (char) (ch + 'a');
                ans += c;
                cnt[ch]--;
            }
        }
        for (int i = 0; i < 26; ++i) {
            while (cnt[i] != 0) {
                char c = (char) (i + 'a');
                ans += c;
                cnt[i]--;
            }
        }

        return ans;
    }
}