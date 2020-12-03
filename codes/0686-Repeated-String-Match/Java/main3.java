class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n1 = a.length(), n2 = b.length(), cnt = 1;
        String t = a;
        while (t.length() < n2) {
            t += a;
            ++cnt;
        }
        if (t.contains(b)) return cnt;
        t += a;
        return (t.contains(b)) ? cnt + 1 : -1;
    }
}