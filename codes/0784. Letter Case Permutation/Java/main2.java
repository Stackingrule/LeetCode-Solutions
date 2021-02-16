class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        traceback(result, S.toCharArray(), 0);
        return result;
    }

    private void traceback(List<String> result, char[] s, int len) {
        if (len == s.length) {
            result.add(String.valueOf(s));
            return;
        }
        traceback(result, s, len + 1);
        if (s[len] > '9') {
            s[len] ^= (1 << 5);
            traceback(result, s, len + 1);
        }
    }
}