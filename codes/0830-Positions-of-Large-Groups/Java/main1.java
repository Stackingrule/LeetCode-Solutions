class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int n = s.length(), i = 0, j = 0;
        while (j < n) {
            while (j < n && s.charAt(j) == s.charAt(i)) ++j;
            if (j - i >= 3) res.add(new ArrayList<Integer>(Arrays.asList(i, j - 1)));
            i = j;
        }
        return res;
    }
}