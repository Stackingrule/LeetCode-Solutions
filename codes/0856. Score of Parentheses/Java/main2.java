class Solution {
    public int scoreOfParentheses(String S) {
        int res = 0, l = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                l++;
            } else { // this means when s.charAt(i) == ')', this statement will be executed and so is
                     // the next if
                l--;
                if (S.charAt(i) == ')' && S.charAt(i - 1) == '(') { // if we have a adjacent pair ()
                    res += 1 << l; // what is the order of execution of << and +
                }
            }
            return res;
        }
}