class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] res = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int t = stack.pop();
                res[t] = i - t;
            }
            stack.push(i);
        }
        return res;
    }
}