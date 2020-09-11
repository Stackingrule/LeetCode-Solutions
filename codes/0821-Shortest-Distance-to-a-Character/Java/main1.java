class Solution {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        char[] chars = S.toCharArray();
        int[] res = new int[len];
        int pos = Integer.MIN_VALUE/2;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C) pos = i;
            res[i] = i - pos;
        }
        pos = Integer.MAX_VALUE/2;
        for (int i = len - 1; i >= 0; i--) {
            if (S.charAt(i) == C) pos = i;
            res[i] = Math.min(pos - i, res[i]);
        }
        return res;
    }
}