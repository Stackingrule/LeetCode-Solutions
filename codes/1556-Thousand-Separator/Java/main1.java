class Solution {
    public String thousandSeparator(int n) {
        String s = n + "";
        int le = s.length();
        StringBuilder res = new StringBuilder();
        if(le < 4) return s;
        int cur = 0;
        for(int i = le - 1; i > -1; i--) {
            if(cur % 3 == 0 && cur != 0) res.append(".");
            res.append(s.charAt(i));
            cur++;
        }
        return res.reverse().toString();
    }
}