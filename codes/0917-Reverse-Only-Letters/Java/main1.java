class Solution {
    public String reverseOnlyLetters(String S) {
        int len = S.length();
        char[] chars = S.toCharArray();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            while (i < j && !isAlpha(chars[i])) {
                i++;
            }
            while (i < j && !isAlpha(chars[j])) {
                j--;
            }
            if (i == len || j < 0) {
                return S;
            }
            swap(chars, i, j);
            i++;
            j--;
        }
        return String.valueOf(chars);

    }

    private boolean isAlpha(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) return true;
        return false;
    }
    private void swap(char[] chars, int i, int j) {
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }
}