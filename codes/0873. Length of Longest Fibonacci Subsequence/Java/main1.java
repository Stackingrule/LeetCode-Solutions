class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int a : arr)
            set.add(a);
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int a = arr[i], b = arr[j], cnt = 2;
                while (set.contains(a + b)) {
                    b = a + b;
                    a = b - a;
                    ++cnt;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return (ans > 2) ? ans : 0;
    }
}