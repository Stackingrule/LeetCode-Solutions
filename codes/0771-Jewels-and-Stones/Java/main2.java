class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        HashSet<Character> s = new HashSet<>();
        for (int i = 0; i < J.length(); ++i) {
            s.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); ++i) {
            if (s.contains(S.charAt(i))) {
                ++res;
            }
        }
        return res;
    }
}