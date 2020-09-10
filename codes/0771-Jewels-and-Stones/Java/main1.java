class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        int res = 0;
        for (char ch : s) {
            for (char c : j) {
                if (ch == c) {
                    ++res;
                    break;
                }
            }
        }
        return res;
    }
}