class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet(Arrays.asList(words));
        for (String word : words) {
            for (int k = 1; k < word.length(); k++) {
                good.remove(word.substring(k));
            }
        }
        int res = 0;
        for (String word : good) {
            res += word.length() + 1;
        }
        return res;
    }
}