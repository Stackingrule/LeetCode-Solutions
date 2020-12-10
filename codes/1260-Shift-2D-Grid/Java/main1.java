class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                queue.add(grid[i][j]);
            }
        }
        for (int i = 0; i < k; i++) {
            queue.addFirst(queue.pollLast());
        }
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(queue.poll());
            }
            res.add(new ArrayList<Integer>(temp));
        }
        return res;
    }
}