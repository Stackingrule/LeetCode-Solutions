class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        char[] chars = S.toCharArray();
        int cnt =  1, cur = 0;
        for (char c : chars) {
            int t = widths[c - 'a'];
            if (cur + t > 100) ++cnt;
            cur = (cur + t > 100) ? t : cur + t;
        }
        return new int[]{cnt, cur};
    }
}