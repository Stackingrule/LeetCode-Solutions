class Solution {
    public int repeatedStringMatch(String a, String b) {
        String t = a;
        for (int i = 1; i <= b.length() / a.length() + 2; ++i) {
            if (t.contains(b)) return i;
            t += a;
        }
        return -1;
    }
}