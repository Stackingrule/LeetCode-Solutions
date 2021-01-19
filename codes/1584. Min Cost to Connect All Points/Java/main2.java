class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue < int[] > heap = new PriorityQueue < int[] > ((a, b) - > Integer.compare(a[2], b[2]));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                heap.offer(new int[] {i, j, Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1])});
            }
        }
        UnionFind uf = new UnionFind(n);
        int selectedEdges = 0, cost = 0;
        while (heap.size() > 0 || selectedEdges < n - 1) {
            int[] e = heap.poll();
            int x = e[0], y = e[1], d = e[2];
            int p = uf.find(x);
            int q = uf.find(y);
            if (p == q) continue;
            selectedEdges++;
            uf.union(p, q);
            cost += d;
        }
        return cost;
    }
    private class UnionFind {
        int[] parents;

        public UnionFind(int n) {
            parents = new int[n];
            for (int i = 0; i < n; i++) {
                parents[i] = i;
            }
        }
        public int find(int i) {
            if (i == parents[i]) {
                return i;
            }
            return find(parents[i]);
        }
        public void union(int i, int j) {
            int p = find(i);
            int q = find(j);
            if (p != q) {
                parents[i] = parents[j];
            }
        }
    }
}