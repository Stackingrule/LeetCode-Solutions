class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0, n = word.length();
        for (int i = 0; i < n; ++i) {
        	if (word.charAt(i) <= 'Z') cnt++;
        }

        return cnt == 0 || cnt == n || (cnt == 1 && word.charAt(0) <= 'Z');
    }
}