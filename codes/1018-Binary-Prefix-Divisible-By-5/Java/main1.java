class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<>();
        int n = A.length, total = 0;
        for (int i = 0; i < n; ++i) {
            total = total * 2 + A[i];
            total %= 5;
            ans.add(total == 0);
        }
        return ans;
    }
}