public class Solution {
    public int maxRepeating(String sequence, String word) {
        String w = word;
        int res = 0;
        while (w.length() <= sequence.length()) {
            if (sequence.contains(w)) {
                res++;
                w += word;
            } else {
                break;
            }
        }

        return res;
    }
}
