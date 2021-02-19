class Solution {
    public int minKBitFlips(int[] A, int K) {
        int n = A.length;
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            if (!q.isEmpty() && i >= (q.peek() + K))
                q.poll();
            if (q.size() % 2 == A[i]) {
                if (i + K > n)
                    return -1;
                q.add(i);
                ++ans;
            }
        }

        return ans;
    }
}