class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int n = s.length(), start = 0;
        for (int i = 1; i <= n; ++i) {
            if (i < n && s.charAt(i) == s.charAt(start))
                continue;
            if (i - start >= 3) {
                res.add(new ArrayList<Integer>(Arrays.asList(start, i - 1)));
            }
            start = i;
        }
        return res;
    }
}