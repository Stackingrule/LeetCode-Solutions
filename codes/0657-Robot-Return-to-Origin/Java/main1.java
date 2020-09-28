class Solution {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        char[] chars = moves.toCharArray();
        for (char ch : chars) {
            if (ch == 'U') {
                i += 1;
            } else if (ch == 'D') {
                i -= 1;
            } else if (ch == 'R') {
                j += 1;
            } else if (ch == 'L') {
                j -= 1;
            }
        }
        return i == 0 && j == 0;
    }
}