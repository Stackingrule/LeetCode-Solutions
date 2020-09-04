class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int n = S.length(), start = 0, last = 0;
        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            m.put(S.charAt(i), i);
        }
        for (int i = 0; i < n; ++i) {
            last = Math.max(last, m.get(S.charAt(i)));
            if (i == last) {
                res.add(i - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}