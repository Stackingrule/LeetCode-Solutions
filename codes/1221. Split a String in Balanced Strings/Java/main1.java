class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'L') left++;
            else left--;
            if (left == 0) ++ans;
        }
        return ans;
    }
}