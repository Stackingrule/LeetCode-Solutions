class Solution {
    public int maxScore(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        for (char c : chars) {
            if (c == '1')
                right++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i] == '0')
                left++;
            else
                right--;
            res = Math.max(res, left + right);
        }
        return res;
    }
}