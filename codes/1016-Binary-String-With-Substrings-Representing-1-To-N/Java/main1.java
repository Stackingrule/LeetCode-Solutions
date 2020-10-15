class Solution {
    public boolean queryString(String S, int N) {
        for(int n = N; n >= 1; n--) {
            String s = Integer.toBinaryString(n);
            if(S.indexOf(s) < 0) {
                return false;
            }
        }
        return true;
    }
}