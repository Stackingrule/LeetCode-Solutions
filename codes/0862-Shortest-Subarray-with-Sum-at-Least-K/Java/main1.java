class Solution {
    public int shortestSubarray(int[] A, int K) {
        int n = A.length, res = Integer.MAX_VALUE;
        Deque<Integer> q = new LinkedList<>();
        int[] sums = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            sums[i] = sums[i - 1] + A[i - 1];
        }
        for (int i = 0; i <= n; ++i) {
            while (!q.isEmpty() && sums[i] - sums[q.getFirst()] >= K) {
                res = Math.min(res, i - q.pollFirst());
            }
            while (!q.isEmpty() && sums[i] <= sums[q.getLast()]) {
                q.pollLast();
            }
            q.add(i);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}